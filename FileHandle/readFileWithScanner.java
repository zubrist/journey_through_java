package FileHandle;

import  java.io.File;
import java.io.FileNotFoundException;
import  java.util.Scanner;

public class readFileWithScanner {
    public static void main(String[] args) {
        try {
            File myfile = new File("data2.txt");

            Scanner sc = new Scanner(myfile);

            while (sc.hasNextLine()) {
                String lines = sc.nextLine();
                System.out.println(lines);
                
            }
            sc.close();
            
        } catch (FileNotFoundException e) {
           System.out.println("Requested file not found in your directory");
        }
    }
}
