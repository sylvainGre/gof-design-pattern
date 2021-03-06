package behavioral.command.impl;

import behavioral.command.model.Command;
import behavioral.command.model.FileSystemReceiver;

public class WriteFileCommand implements Command {

    FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}
