package day19stringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        //What is "StringBuilder Class"?
        //"StringBuilder Class" is for "Mutable Strings"


        //We use "String Class" to create a String, why or when we will need "StringBuilder Class" ?
        //String Class is "immutable", "StringBuilder Class" is mutable.

        //String Class is immutable beacuse of that it doesnt change existing value.
        //If you want to assign a new value to  a variable, Java will create a new container inside the "String Pool"(String pool
        // contains the all strings)  then will put new value in it, then changes the address pointer to the new container.

            String name = "Tom";
            System.out.println(name);//Tom never
            name = "Mark";
            System.out.println(name);

        //If any container does not have any address pointer, "Garbage Collector" removes the container
        //from the memory.Before removing things from memory, Java "finalize" them, without
        //finalizing Java does not remove anything from memory.

        String s = "Jhon";
        String r = "Jhon";

        r="Sam";

        //I want a seperate container whose value is Jhon
        String u = new String("Jhon");

        //If you want to change the value directly, without creating new container in memory you can use "String Builder Class

        StringBuilder sb = new StringBuilder("Clara");

        sb = new StringBuilder("Jim");

        //How to create a StringBuilder Object
        //1.Way:
        StringBuilder sb1 = new StringBuilder("Clara");
        System.out.println(sb1);
        //2.Way:
        StringBuilder sb2 = new StringBuilder();
        System.out.println();//Empty
        sb2.append("Clara");
        System.out.println(sb2);//Clara
        sb2.append("Ocean");
        System.out.println(sb2);//ClaraOcean

        sb2.append("Miami").append("FL").append("USA");
        System.out.println(sb2);//ClaraOceanMiamiFLUSA

        //How to learn the capacity in a StringBuilder
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Jackson");
        sb3.append("Mexico");
        sb3.append("The USA");
        sb3.append("1234567890123456");


        System.out.println(sb3.length());//40

        int cap = sb3.capacity();
        System.out.println(cap);//70

        //NOte: If you exceed the existing capacity, Java will increase the capacity
        //like: 2*Existing Capacity +2
    }
}
