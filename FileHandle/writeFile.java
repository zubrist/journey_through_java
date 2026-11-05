package FileHandle;

import java.io.FileWriter;
import  java.io.IOException;
public class writeFile {

    public static void main(String[] args) {

        try{
        FileWriter myfile = new FileWriter("data.txt");

        myfile.write("Testing my first file");
        myfile.write(" My name is Reja");
        myfile.close();
        }catch(IOException e)
        {
            System.out.println("Expetion occur....");
        }
    }
}
