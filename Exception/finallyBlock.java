package Exception;
// finally : always executed regardless 
//  It’s generally used for cleanup code, like closing files or releasing resources.
public class finallyBlock {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
            //System.out.println(str);

        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}
