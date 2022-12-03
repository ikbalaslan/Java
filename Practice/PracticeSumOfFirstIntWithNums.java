package practice;

public class PracticeSumOfFirstIntWithNums {
    public static void main(String[] args) {
         /*
       Create a method that adds given integers except the first one and multiplies the sum by the first integer.
         a*(b+c+d+f)
    */
        //My Way


        myMethod(6,2,3,4,5);
        ikbalMethod(2345);//I did it for just single integer's elements.

        myMethod(3.4,2,3,6);//37.4

    }

    //Teachers Way
    public static void myMethod(int a, int...numbers){
        int sum = 0;
        for (int w:numbers){
            sum+=w;  //different way of typing sum=sum+w;
        }
        System.out.println(a*sum);
    }
    public static void myMethod(double a,int ...numbers){
        int sum = 0;
        for (int w:numbers){
            sum+=w;  //different way of typing sum=sum+w;
        }
        System.out.println(a*sum);
    }

    public static void ikbalMethod(int a) {
            String b = String.valueOf(a);
        int sum=0;
        for (int i =1; i<b.length();i++){
            String x = b.substring(i,i+1);
            sum=sum + Integer.valueOf(x);
        }
        int y =Integer.valueOf(b.substring(0,1));
        int newSum = y*sum;
        System.out.println(newSum);
    }


}
