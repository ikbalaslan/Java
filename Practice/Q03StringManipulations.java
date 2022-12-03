package practice;

public class Q03StringManipulations {
    public static void main(String[] args) {
           /*
       String shirtPrice= "$ 12.99";
       String bookPrice= "$ 35.99";

       Type a code to find the sum of the shirt and book prices.

     */

        String shirtPrice = "$ 12.99";
        String bookPrice = "$ 35.99";

        String book = bookPrice.replace("$", "");

        String shirt = shirtPrice.replace("$", "");
        System.out.println(shirt);

        double sd= Double.valueOf(shirt);
        System.out.println(shirt);


















    }
}
