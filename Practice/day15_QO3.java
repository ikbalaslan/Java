package practice.day15;

public class day15_QO3 {
    public static void main(String[] args) {
        //Type code to check if a given integer is polindrome or not.
        //Polindrome: 121<==>121     123321<==>123321

     String s = "1233201";
     String d = "";

        for (int i=s.length()-1;i>=0;i--){
            String c = s.substring(i,i+1);
            d=d+c;

            }

        if (d.equals(s)) {
            System.out.println("Polyndrome");
        }else{
            System.out.println("Not polyndrome");
        }






























        }
}
