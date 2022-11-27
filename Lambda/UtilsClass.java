package day32lambdafp;

public class UtilsClass {
    public static void printInTheSameLineWithASpace(Object str){
        System.out.print(str + " ");

    }
    public static boolean checkToBeEven(int x){
        return x%2==0;
    }
    public static boolean checkToBeOdd(int x){
        return x%2!=0;
    }
    public static int squareElements(int x){
        return x*x;
    }
    public static int cubeOfElement(int x){
        return x*x*x;
    }
    public static Integer sumOfElements(int x,int y){
        int sum = 0;
        x = x+y;
        sum = sum + x;
        return sum;
    }
    public static Double getHalf(int x){
        return x/2.0;
    }
    //INTERVIEW ALERT
    public static Integer getSumOfDigits(int x){
        int sum = 0;
        while(x!=0){
           sum += x%10;
           x=x/10;
        }return sum;
    }

}
