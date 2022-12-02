package practice;

public class PracticeCalculateVolumeOfCube {
    //Create a method to calculate volume of cube, square prism and rectangular prism.
    public double volumeOfCube(double a){
        return a*a*a;
    }
    public static double volumeOfSquarePrism(double a, double b){
        return a*a*b;
    }

    public static double volumeOfRectangularPrism(double a, double b, double c){
        return a*b*c;
    }

    public static void main(String[] args) {
        System.out.println(volumeOfRectangularPrism(2, 3, 4));
   PracticeCalculateVolumeOfCube c1 = new PracticeCalculateVolumeOfCube();

    }

}
