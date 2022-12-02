package practice;

import java.util.ArrayList;
import java.util.List;

public class MyTraining07 {
    public static void main(String[] args) {
        int num1=9;

        int num2= num1++;
        int num3=num1;

        // i++  -->First use it then increase it.    ++i  -->  First increase it then use it.


        if(num3 < 10){
            System.out.println(num2 + " Hello World");
        } else {
            System.out.println(num1 + " Hello Universel");
        }

        System.out.println(num2);
        System.out.println(num1);

        /*
         * Type code to find the common elements between two String Arrays
         * (without case sensitivity)
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
         */

        String a[] = {"John","Brad","Angel","Sofia","Emily"};
        String b[] = {"sofia","Brad","grace","emily","hazel"};
        List<String> ab = new ArrayList<>();

        for (int i=0; i<a.length; i++){

            for (int k=0; k<b.length;k++){
                if (a[i].equalsIgnoreCase(b[k])){
                    ab.add(a[i]);
                }
            }
        }
        System.out.println(ab);

        String sd = "Christmas";
        String result = "";
        for(int i=0; i<sd.length(); i++){
            String c = sd.substring(i,i+1);
            if(c.equals("m")){
                break;
            }
            result = result + c;
        }
        System.out.println(result);



        String s = "accessories";



        String d = "c";
        for (int i =0; i<=s.length()-1;i++){
            String c = s.substring(i,i+1);
            if (s.indexOf(c)!=s.lastIndexOf(c)) {
                if (!d.contains(c)) {
                    d = d + c;
                }
                System.out.println(d);


            }}

        //What is the output?






        //What is the output?
        int i = 1;
        do{

            if(i==3) {
                continue;
            }else if(i==5){
                System.out.print(i + " ");
                break;
            }else{
                System.out.println(i + " ");
            }
            i++;

        }while(true);











    }
}
