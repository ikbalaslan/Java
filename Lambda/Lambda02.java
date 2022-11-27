package day32lambdafp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lambda02 {
   /*
   1) "Variable or variables" ==>"logic" ==> this structure is called "Lambda expression"
   2) In Functional Programming, we can use "Lambda Expression", it is allowed but not recommended.
      Instead of "Lambda Expression", we prefer "method reference".
   3) Method Reference is Class Name :: Method Name
      For Example:      "String ::length"  (Do not type method paranthesis, type just method name)
                        "Arrays ::toString"
      You can use your own class to create the requeired methods for your application.For ex;you created "Animal" class you have eat()
      in "Animal" class ==> "Animal::eat"

    */

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        printElementsFunctional(l);//8 9 131 10 9 10 2 8
        System.out.println();
        printEvenElementsStructured(l);//8 10 10 2 8
        System.out.println();
        printSquareOfOddElements(l);//81 17161 81
        System.out.println();
        sumOfSquaresDistinctEvenElements(l);//Optional[168]
        System.out.println();
        productOfCubesOfDistinctEvenElements(l);//4096000
        System.out.println();
        getMaximumElement01(l);//131
        System.out.println();
        getMinGreaterThanSevenEvenNum(l);//8
        System.out.println();
        getHalfOfDistinctElReversed(l);
    }
    //Create a method to print the elements on the console in the same line with a space
    // between two consecutive elements.
    public static void printElementsFunctional(List<Integer> list){
        list.stream().forEach(UtilsClass::printInTheSameLineWithASpace);

    }

    //Create a method to print the event elements in the list on the console in the same line with a space
    //between two consecutive elements(Functional with method referenceP)

    public static void printEvenElementsStructured(List<Integer> list1){

        list1.stream().filter(UtilsClass::checkToBeEven).forEach(UtilsClass::printInTheSameLineWithASpace);

    }
    //Create a method to print thr square of odd list elements on the console in the same line with a space between two consecutive elements.
    //two consecutive elements

    public static void printSquareOfOddElements(List<Integer> list1){
        list1.stream().filter(UtilsClass::checkToBeOdd).map(UtilsClass::squareElements).forEach(UtilsClass::printInTheSameLineWithASpace);
    }
    //4) Create a method to print the cube of distinct odd list elements on the console in the same line
    //with a space between two consecutive elements
    public static void printCubeOfDistinctOddElements(List<Integer> list1){
        list1.stream().distinct().filter(UtilsClass::checkToBeOdd).map(UtilsClass::cubeOfElement).forEach(UtilsClass::printInTheSameLineWithASpace);
    }
    // 5)Create a method to calculate the sum of the squares of distinct even elements

    public static void sumOfSquaresDistinctEvenElements(List<Integer> list1){
       Optional<Integer> sum = list1.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::squareElements).reduce(UtilsClass::sumOfElements);
        System.out.println(sum);
    }

    public static void sumOfSquaresDistinctEvenElements02(List<Integer> list1){
        Integer sum = list1.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::squareElements).reduce(0,Integer::sum);
        System.out.println(sum);
    }
    //6) Create a method to calculate the product of the cubes of distinct even elements

    public static void productOfCubesOfDistinctEvenElements(List<Integer> list1){
      Integer sum =  list1.stream().distinct().filter(UtilsClass::checkToBeEven).map(UtilsClass::cubeOfElement).reduce(1,Math::multiplyExact);
        System.out.println(sum);
    }
    //7) Create a method to find the maximum value from the list elements

    public static void getMaximumElement01(List<Integer> list1){
       Integer min = list1.stream().distinct().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(min);
    }
    //9) Create a method to find the minimum value greater than 7 and even elements from the list.

    public static void getMinGreaterThanSevenEvenNum(List<Integer> list){
       Integer result = list.stream().distinct().filter(t->t>7).filter(UtilsClass::checkToBeEven).reduce(Integer.MAX_VALUE,Math::min);
        System.out.println(result);
    }
    //10) Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
    public static void getHalfOfDistinctElReversed(List<Integer> list1){
        List<Double> resultList = list1.
                    stream().
                    distinct().
                    filter(t->t>5).
                    map(UtilsClass::getHalf).
                    sorted(Comparator.reverseOrder()).
                    collect(Collectors.toList());
        System.out.println(resultList);
    }


}
