package day23encapsulationabstraction;

public class StudentRunner {
    public static void main(String[] args) {
        Student std1 = new Student();
        System.out.println(std1.name);
        System.out.println(std1.getStdId());
        std1.setDisease(null);
        System.out.println(std1.getDisease());

        std1.setStdGpa(4.0);
        System.out.println(std1.getStdGpa());

    }
}
