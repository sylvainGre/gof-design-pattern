package behavioral.memento.test;

import behavioral.memento.impl.FileWriteUtil;
import behavioral.memento.impl.FileWriterCaretaker;

public class FileWriterClient {
    public static void main(String[] args){
        FileWriterCaretaker fileWriterCaretaker = new FileWriterCaretaker();

        FileWriteUtil fileWriteUtil = new FileWriteUtil("myFile");
        fileWriteUtil.write("Version 1 -");

        System.out.println(fileWriteUtil.toString() + " \n");

        fileWriterCaretaker.save(fileWriteUtil);

        fileWriteUtil.write("Version 2 ");
        System.out.println(fileWriteUtil.toString()+ " \n");

        fileWriterCaretaker.undo(fileWriteUtil);
        System.out.println(fileWriteUtil.toString()+ " \n");
    }
}
