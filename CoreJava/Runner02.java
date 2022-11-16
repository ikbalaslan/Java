package day22inheritancepolymorphism;

public class Runner {
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println(c.name);//Cat

        Mammal d = new Cat();
        System.out.println(d.name);//Mammal

        Animal e = new Cat();
        System.out.println(e.name);//Animal

        System.out.println("=================");

        Cat f = new Cat();
        f.eat();

        /*
        1) "super" keyword is used to get data(variables + methods) from parent classes in inheritance.
        2) If there is no data in parent class, Java looks for the data in grandparents if no parents has
           the data Java gives compile time error.
        3)"super()" must be the first statement in the constructor but "super" can be in any line
        4) "super()" is for calling constructors from parent class, "super" is for calling variables and methods
           from  the parent class.
        5) "this" is used to call data "variables and methods" from the class itself.
           When you use "this" , it means you are telling the Java " do not go to parent, stay in this class".

         */

    /*
          1) When the child classes use the methods from the parent classes we may need to update   implementation of the methods.
               For example; in Animal class eat() method tells "Animals eat", but to tell "Animals eat" in Cat class is not good.
               To be able to create specific implementation for the Cat class like "Cats eat" we should update the method body.
               This is called "Method overriding"
          2) To do method Overriding we need "inheritance". If there is no "inheritance" it means there is no "Method overriding".
          3) When we use "Method overriding", we do not touch to the "Method signature"(Method name + parameters)
          4) "@Override" annotation checks the "Overriding Rules" when you do "Overriding".
          5) When you do "Method overriding", you cannot use "Narrower" access modifier in child class.
             but when you do "Method overriding", you can use "Wider" access modifier in child class.
          6) When you do "Method overriding", the method in parent class is called "Overridden Method",
             the method in child class is called "Overriding method".
          7)When you do "Method overriding", If the return type is "void" in "Overridden" method,
            return type of the "Overriding" method must be "void".
          8))When you do "Method overriding", return type of the overriding method can be same or the child
             of the return type of the "Overridden method".
             From child return type to parent type you must have "IS-A" Relationship.
          9)Between "Wrapper classes" , Java did not create "Parent-child" relationship, therefore between the Wrapper
            classes there is no "IS-A" relationship. If there is no "IS-A" relationship
            you cannot change the return types in "Method overriding"

          10)When you do "Method overriding", if the return type of the "Overridden method" is "primitive"
             you cannot change it in "Method Overriding" because Primitive data types  are not classes
             if they are not classes you cannot have "IS-A" relationship.

             Note: If a method is final, it means its body cannot be updated.
          11)The body of a "final method" cannot be updated, because in overriding we change the method body,
           but final method do not allow us the change the body.

          12)"Private" methods cannot be overridden, because to override a method we have to access to it.
             "private" methods are not accessible

          13)"static" cannot be overridden because "static" things are common for all child
             classes, if any child updates the static method body other child classes will be
             effected as well, therefore Java does not let you  override a static method.

     */

/*
      1) Relationship from "parent" to "child" is called "HAS-A" Relationship.
      2) Relationship from "child" to "parent" is called "IS-A" Relationship.

 */

 }
         }