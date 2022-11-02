package day06stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Example 1: Type code to see the order number of the first occurance of the  character 'a'
        //        "I want to learn Java"

        String str = "I want to learn Java";

       int idx = str.indexOf('a');//indexOf() method gives you the index of first occurence of a spesific character

        System.out.println(idx+1);

        //Example 1: Type code to see the order number of the first occurance of "Java"

        //           "I like to study Java, learn Java, earn money, Java is easy"
        String d1 = "I like to study Java, learn Java, earn money, Java is easy";

        //Note 1: IndexOf() method can be used with "char" and "String" data types like str.indexOf('a'); and like d1.indexOf("Java");

        //Note 2: If you use String inside the indexOf(), it will return the index of first character.

        //Note 3: d1.indexOf("xyz"); ==> -1 indexOf() method returns "-1" for non-existing characters
        int c1 = d1.indexOf("Java");
        System.out.println(c1+1);

        int t = d1.indexOf('w');
        System.out.println(t);//-1

        //Example 3: Type a code to check if a String has 'a' in it or not. Print appropriate messages for the scenerios.

        //1.Way:
        String word = "I like to study";

        int x1 = word.indexOf('a');
        if (x1==-1){
            System.out.println("There is no 'a'");
        }else {
            System.out.println("There is 'a' on this sentence");
        }
        //2.Way:
       String t2 = word.indexOf('a')==-1 ? "There is no 'a'" : ("There is 'a' on this sentence");
        System.out.println(t2);


        // Example 4: Type code to find the order number of last occurence of "Java".

        String r1 = "I like to study Java, learn Java, earn money, Java is easy";

       int lastIndex = r1.lastIndexOf("Java");
        System.out.println(lastIndex);


      //FOR FUN:

       String durAk = r1.split(" ")[3].substring(2,3);
        System.out.println(durAk);

        //Example 5: Type code to check if a character is unique in a String or not
        //           "Hello" ==> H is unique, e is unique, o is unique, l isnt unique beacuse it repeats.

       String t4 = "Hello";
               //1.Way

               if (t4.indexOf('l')==t4.lastIndexOf('l')){

               }else {
                   System.out.println("Not Unique");
               }

                 //2.Way


                   String t5 = t4.indexOf('l')==t4.lastIndexOf('l') ? "Unique" : "Not Unique";
                   System.out.println(t5);




















    }
}
