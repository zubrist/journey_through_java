package FileHandle;


import  java.io.File;

public class fileInfo {
   public static void main(String[] args) {
        //  Creating an object of the File class

        File file  = new File("testing.txt") ;

        if(file.exists()){
            System.out.println("Your file is already exists");
            System.out.println("The file is "+ file.length() + " bytes long");
            System.out.println("Your file is at "+ file.getAbsolutePath() +" location");

            if(file.canRead())
            {
                System.out.println("this file can be read");
            }
            else{
                System.out.println("File reading permission denied.");
            }

            if(file.canWrite())
            {
                System.out.println("this file can be Written");
            }
            else{
                System.out.println("File writing permission denied.");
        }
        
    }
 
}
}
