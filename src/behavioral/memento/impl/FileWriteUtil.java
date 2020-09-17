package behavioral.memento.impl;

public class FileWriteUtil {
    private String fileName;
    private StringBuilder content;

    public FileWriteUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return "FileWriteUtil{" +
                "content=" + content +
                '}';
    }

    public void write(String str){
        this.content.append(str);
    }

    public Memento save(){
        return new Memento(this.fileName,this.content);
    }

    public void undoLastSave(Object object){
        Memento memento = (Memento) object;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }

    private class Memento{
        private String fileName;
        private StringBuilder content;

        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            this.content = new StringBuilder(content);
        }
    }
}
