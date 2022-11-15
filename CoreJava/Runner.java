package day20accessmodifiersinheritance;

public class Runner {
    public static void main(String[] args) {
   Student std1 = new Student();
   //When you go outside the class private variable will not be seen from other classes.
        System.out.println(std1.stdName);

        Student std2 = new Student();
        System.out.println(std2.stdGpa);//3.83

        System.out.println(Student.address);//In static variables you dont have to create an object you can access it just by using classes.
        //Protected means child of Student Class. So if access type is protected from other packages you cant see the protected variables.


    }
}
