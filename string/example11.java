package string;

public class example11 {
    public static void main(String[] args) {
        // checking frequency of a specific keyward 
        String text = "Java is fun. I love Java. Java is powerful!";
        String keyword = "Java";

        int count = 0;

        int index= text.indexOf(keyword);

        while(index != -1){
            count++ ;
            System.out.println("Found '" + keyword + "' at index: " + index);

            index = text.indexOf(keyword, index + keyword.length());
        }
        System.out.println("The substring '" + keyword + "' occurs " + count + " times.");
    }   
}
