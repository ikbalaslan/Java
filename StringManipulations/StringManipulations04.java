package day07stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {
        String str = " ";
        boolean result1 = str.isEmpty();//isEmpty() method returns true if the String does not have any characters, return false if the String has any character.
        // str.length()==0 and isEmpty() have same meaning but to check if a String is empty using isEmpty() preferable

        System.out.println(result1);//false

        boolean result2 = str.isBlank();//Will give you if you use space character
        //isEmpty("")==>true, isEmpty(" ")==>false
        //isBlank("")==>true, isEmpty(" ")==>true
        System.out.println(result2);

        //Example 1:Check if a String has just letters and spaces in it
        String str2 = "Learn Java earn money";
        boolean result3 = str2.replaceAll("[a-zA-Z]", "").isEmpty();
        System.out.println(result3);

        //Example 2:Check SSN for the following rules
        //          1)It must have just digits
        //          2)It must have 9 digits
        String ssn = "123A45678";

        //1)It must have just digits
        boolean firstRule = ssn.replaceAll("[0-9]", "").isEmpty();

        //2)It must have 9 digits
        boolean secondRule = ssn.length() == 9;

        if (firstRule && secondRule) {
            System.out.println("Valid ssn");
        } else {
            System.out.println("Invalid ssn");


        }

    }
}