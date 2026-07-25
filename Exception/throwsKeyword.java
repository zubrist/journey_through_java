package Exception;
//The throws keyword is used in method declarations to indicate that a method might throw an exception.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
returnType methodName() throws ExceptionType {
    // code
}
*/
public class throwsKeyword {
    
    static void fileRead() throws IOException {
        FileReader file = new FileReader("Exception\\testfile.txt");
        BufferedReader fileinput = new BufferedReader(file);
        System.out.println(fileinput.readLine());
        fileinput.close();

    }

    public static void main(String[] args) {
        try {
            fileRead();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
