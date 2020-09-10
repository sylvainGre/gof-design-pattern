package behavioral.command.model;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
