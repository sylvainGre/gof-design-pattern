package behavioral.command.impl;

import behavioral.command.model.FileSystemReceiver;

public class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Open file in windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Write file in windows OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Close file ins windows OS");
    }
}
