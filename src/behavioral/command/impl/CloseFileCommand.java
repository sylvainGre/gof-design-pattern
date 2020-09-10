package behavioral.command.impl;

import behavioral.command.model.Command;
import behavioral.command.model.FileSystemReceiver;

public class CloseFileCommand implements Command {
    FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}
