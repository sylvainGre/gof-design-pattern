package behavioral.memento.impl;

public class FileWriterCaretaker {

    private Object object;

    public void save(FileWriteUtil fileWriteUtil){
        this.object = fileWriteUtil.save();
    }

    public void undo(FileWriteUtil fileWriteUtil){
        fileWriteUtil.undoLastSave(this.object);
    }
}
