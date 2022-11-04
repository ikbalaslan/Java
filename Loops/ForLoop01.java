package day09loops;

public class ForLoop01 {
    public static void main(String[] args) {
        //Example 1: Type code to reverse a String
        //           For Example: Tom ==> moT
        String d= "Mark";
        String reversedName= "";
        for (int i =d.length()-1;i>=0;i--){

            char ch = d.charAt(i);
          reversedName = reversedName + ch;
        }
        System.out.println(reversedName);
        //Example 2: Find the sum of the integers from 3 to 6
        int sum = 0;
        for (int i=3;i<7;i++){
            sum=sum+i;
        }
        System.out.println(sum);

        // //Example 3: Find the multiplication of the integers from 3 to 6,
       int multiplication = 1;
        for (int i =3;i<7;i++){
            multiplication=multiplication*i;
        }
        System.out.println(multiplication);


        //Example 4: Type code to find the sum of the digits of an integer
        //           584 ==> 5+8+4=17

        //Note: "number % 10" gives you the last digit

        //My way
        int num = 342;
        int as = num%10+((num/10)%10)+num/100;
        System.out.println(as);
        //Mr.Suleymans way


        int num1 = -584;
        num1 = Math.abs(num1);
        System.out.println(num1);

        int sumOfDigits = 0;

        for (int i=num1;i>0;i=i/10){
           sumOfDigits =  sumOfDigits + i%10;
        }
        System.out.println(sumOfDigits);




    }
}
