package day11constructorsmethodcallstatickeyword;


public class Runner {
    public static void main(String[] args) {



        //Create an object from "Car" class
         Car audi = new Car();
        System.out.println(audi.make);
        System.out.println(audi.model);

        Car bmw = new Car("BMW","M5",2022,50000);
        System.out.println(bmw.make);// BMW
        System.out.println(bmw.model);//M5
        System.out.println(bmw.year);//2022

        Car mercedes = new Car("Mercedes","C300",2023,60000);
        System.out.println(mercedes.make);//Mercedes
        System.out.println(mercedes.model);//C300

        Car itCar = new Car("Rolls Royce","Cullinan", 2023 );
        System.out.println(itCar.make);
        System.out.println(itCar.model);
        System.out.println(itCar.year);


        Static01 obj1 = new Static01();
        Static01 obj2 = new Static01();
        Static01 obj3 = new Static01();
        System.out.println(obj2.staticCounter);

        System.out.println(obj3.nonStaticCounter);
        System.out.println(obj3.staticCounter);











    }
}
