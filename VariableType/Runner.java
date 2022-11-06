package day12variabletypesstaticblockarrays;

public class Runner {
    public static void main(String[] args) {
       //To access a non-static variable you have to create a object
        VariableTypes01 obj = new VariableTypes01();

        System.out.println(obj.name);//Tom Hanks

        //Actually you can access to static class members by using objects but its not recommended
        System.out.println(obj.age);

        //To access a static variable no need to create object, just class name is enough.
        System.out.println(VariableTypes01.age);//13

        obj.add(3,5);//8

        System.out.println(obj.mult(3,5));


















    }
}
