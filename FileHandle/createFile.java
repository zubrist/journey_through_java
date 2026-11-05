package FileHandle;
import java.io.File; // this is the File class we are gonna use for file related operations
import java.io.IOException;

public class createFile {
    
    public static void main(String[] args) {
        //  Creating an object of the File class

        File file  = new File("testing.txt") ;


        try{
        // createNewFile()-> its return True if file created | False if file is already exists. 

            boolean  fileCreated = file.createNewFile(); // either Ture or false

            if(fileCreated){
                System.out.println("Your file is created.");
            }
            else{
                System.out.println("Your file already exits.");
            }
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }


}
