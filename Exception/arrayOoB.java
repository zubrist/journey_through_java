package Exception;
// Illustrate the 'ArraylndexOutOBound' exception with an example.

public class arrayOoB {
    public static void main(String[] args) {
        try {
            int myArray[] = {1,2,4,5};
            int fav = myArray[10];
        } catch (Exception e) {
           System.err.println("The number Doesn`t exists.");
           System.out.println(e);
           e.printStackTrace();
        }
    }
}
