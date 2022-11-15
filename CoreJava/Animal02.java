package day22inheritancepolymorphism;

public class Animal {

    public String name = "Animal";

    // Overriden method
    public void eat() {
        System.out.println("Animals eat..");


    }

    public Animal create() {
        return new Mammal();
    }
    public Integer add(){
        return 12;
    }

    public int multiply(){
        return 24;
    }

    public final int divide(){
        return 34;
    }



}
