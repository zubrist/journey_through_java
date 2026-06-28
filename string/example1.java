package string;

public class example1 {

    //  How to make a string in Java ?
    public static void main(String[] args) {

    // 1. Using String Literal 


    String str1 =  "Hello";
    String str0 =  "Hello";
    String str5 = "hello";
    

    // str1 is stored in String pool. 
    // The String Pool in Java is a special memory area inside the heap known as the String Constant Pool
    // JVM looks in the String pool to find if any other String is stored with same value. If found, it just returns the reference to that String object
    // hence reducing memory usage 

    // Using new keyword

    String str2 = new String("hello"); // 4kb
    String str3 = new String("hello"); // 4kb


        // ==  and equals()

    if( str2 == str5){
        System.out.println("str0 and str1 referes to same object");
    }
    else {
        System.out.println("str0 and str1 referes to different object");
    }

    }

   
    
}
