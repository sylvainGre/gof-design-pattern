package behavioral.command.test;

import behavioral.command.impl.*;
import behavioral.command.model.FileSystemReceiver;

public class FileSystemClient {
    public static void main(String[] args){
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        fileInvoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.execute();
    }
}
