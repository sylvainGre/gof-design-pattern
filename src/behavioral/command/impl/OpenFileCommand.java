package behavioral.command.impl;

import behavioral.command.model.Command;
import behavioral.command.model.FileSystemReceiver;

public class OpenFileCommand implements Command {
    FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.openFile();
    }
}
