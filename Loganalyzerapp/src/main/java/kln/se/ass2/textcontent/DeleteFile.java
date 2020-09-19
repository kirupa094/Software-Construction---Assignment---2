package kln.se.ass2.textcontent;

public class DeleteFile implements Textfile {
    public void deletefile(){
        textfile.delete();
        System.out.println("File Deleted");
    }
}
