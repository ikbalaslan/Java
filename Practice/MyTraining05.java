package practice;

public class MyTraining05 {
    public static void main(String[] args) {
       /* Type code to check whether a String is palindrome or not. If a String is the same with its
        reverse then it is called palindrome. For example; “anna”, “123321” are palindromes

        */
        /*
        String s = "123321";
        String d = "";
        for (int i = s.length()-1;i>=0;i--) {
            String e = s.substring(i, i + 1);
            d = d + e;
        }
        if (s.equals(d)){
            System.out.println(s + " Is polyndrome");
        }else{
            System.out.println(s + "Not polyndrome");

        }
         */
       /* String s = "1233221";
        String d = "";

        int i = s.length()-1;
        while(i>=0){
            String c = s.substring(i,i+1);
            d = d+c;
            i--;

        }if (s.equals(d)){
            System.out.println(s + " Is polyndrome");
        }else{
            System.out.println(s + "Not polyndrome");
        }

        */
       /* String s = "sadas";
        String d = "";
        int i = s.length()-1;

        do {
            String c =s.substring(i,i+1);
            d = d + c;
            i--;


        }while(i>=0);
        if (s.equals(d)){
            System.out.println(s + " Is polyndrome");
        }else{
            System.out.println(s + "Not polyndrome");
        }

        */

       // 4) Type code to print the unique digits in an integer. Example; 223878 ⇒ 37

       /* String s = "223878";
        String d = "";

        for (int i =0;i<s.length();i++){
            String c = s.substring(i,i+1);
            if (s.indexOf(c)==s.lastIndexOf(c)){
                d=d+c;

            }
        }System.out.println(d);

        */
       /* String s = "223878";
        String d = "";
        int i = 0;

        while(i<=s.length()-1){
            String c = s.substring(i,i+1);
            if (s.indexOf(c)==(s.lastIndexOf(c))){
                d = d + c;

            }i++;

        }
        System.out.println(d);

        */
        /*String s = "223878";
        String d = "";
        int i = 0;

        do {
            String c = s.substring(i, i + 1);
            if (s.indexOf(c) == (s.lastIndexOf(c))) {
                d = d + c;

            }
            i++;


        }while (i < s.length() ) ;
        System.out.println(d);

         */
       /* 5) Type code to draw the following image by using a for loop.
                A A A A A
                A A A A A
                A A A A A

        */
       /* int row =3;
        int column=5;

        for (int i =1;i<=row;i++){
            for (int k =1;k<=column;k++){
                System.out.print("A");
            }
            System.out.println();
        }

        */
        /*int row =3;
        int column=5;
        int i =1;
        while(i<=row){
            for (int k =1;k<=column;k++ ){
                System.out.print("A");
            }
            System.out.println();
       i++;
        }

         */
          /*
        1
        2 1
        3 2 1
        4 3 2 1
         */
    /*    int raw = 4;

        for (int i = 1;i<=4;i++){
            for (int k = i;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }

     */
       // Type code to draw the following image by using a for loop.A
        //A
        //A A
        //A A A
        //A A A A
        /*int rows = 4;
        for(Integer i=1; i<=rows; i++){
            String s = "";
            for(Integer k=1; k<=i; k++){
                s = s + "A ";
            }
            System.out.println(s);
        }

         */
    /*    int rows = 4;

        int i = 1;
        while(i<=rows){

            for (int k =1; k<=i;k++){
                System.out.print("A");

            }
            System.out.println();
        i++;}

     */










































    }
}
