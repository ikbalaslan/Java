package day23encapsulationabstraction;

public class Student {
    public  String name = "Tom Hanks";
    private String stdId = "TH123";
    private double stdGpa = 3.8;
    static private  String disease = "Heart Disease";
    private boolean successful = false;



    public String getDisease(){
         return disease;
     }
    public String getStdId() {
        return stdId;
    }

    public double getStdGpa() {
        return stdGpa;
    }

    //If the data type is "boolean" get method name starts with "is"
    public boolean isSuccessful() {
        return successful;
    }
    //Everytime set() method return type will be "void" because set() method will do just an action.
    // Tt will change the data.
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public void setStdGpa(double stdGpa) {
        this.stdGpa = stdGpa;
    }
//Even the data type is boolean we use "set" at the beginning of the name
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public static void main(String[] args) {


        /*
                                      Encapsulation
        Encapsulation is "data hiding"
        To hide a data we make the access modifier "private"
        After "hiding data" you may need to "read" or "update" the data
        To "read" or "update" the data we will create some methods
        To "read" "encapsulated data" you should create "get()" methods, we name it "getters"
        To "update" "encapsulated data" you should create "set()" methods, we name it "setters"
       "get()" and "set()" methods are called "Java Beans"

       // Note: By using set() method we prevent confusion and save memory by creating just 1 object.

       If a class is "immutable", it is impossible the value of the existing variable.
       ıf you want to make a class "immutable" do not create any "setter" method.

         */
    }
}
