package FileHandle;

import java.io.File;

public class deleteFile {

    public static void main(String[] args) {
        try {
            File file = new File("testing.txt");

            // delete() -> deletes file and return true.

            boolean  fileDeleted = file.delete();

            if(fileDeleted){
                System.out.println("Your File deleted successfully");
            }
            else{
                System.out.println(" File is not deleted.");
            }


        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("File not Found");
        }
    }
}