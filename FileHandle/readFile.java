package FileHandle;
import  java.io.FileReader;
import java.io.IOException;


public class readFile {
    public static void main(String[] args) {
        try{

        char fileContent[] = new char[1000]; 

        FileReader readFile = new FileReader("data.txt");
        

        readFile.read(fileContent); // read() method will read the readFile obj and store in fileContent character array
        
        System.out.println(fileContent);
        readFile.close();

        }catch(IOException e)
        {
            System.out.println("Expetion occur....");
        }
    }
}
