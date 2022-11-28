package day33lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming05 {
    public static void main(String[] args) {
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(checkAvgScoreToBeGreaterThan91(coursesList, 95));
        System.out.println(checkAtLeastOneElementTurkish(coursesList, "Turkish"));
        courseHasHighestAvg(coursesList);
        System.out.println();
        System.out.println(sortTheElementsByAscendingThenSkipFirstTwo(coursesList));
        System.out.println(sortTheElementsByAscendingThengGetThird(coursesList));

    }

    //1) Create a method to check if all average scores are greater than 91
    public static boolean checkAvgScoreToBeGreaterThan91(List<Course> l, double avg) {

        return l.stream().allMatch(t -> t.getAvarageScore() > 91);
    }

    //2) Create a method to check if at least one of the course names contains "Turkish" word
    public static boolean checkAtLeastOneElementTurkish(List<Course> l, String y) {
        return l.stream().anyMatch(t -> t.getCourseName().contains(y));

    }

    //3)Create a method to print the course whose average score is the highest
    public static void courseHasHighestAvg(List<Course> l) {
        Course result = l.stream().sorted(Comparator.comparing(Course::getAvarageScore).reversed()).findFirst().get();
        System.out.println(result);
    }

    //4)Sort the list elements according to the average score in ascending order and skip first 2 elements
    public static List<Course> sortTheElementsByAscendingThenSkipFirstTwo(List<Course> l) {
        return l.stream().sorted(Comparator.comparing(Course::getAvarageScore)).skip(2).collect(Collectors.toList());

    }

    //5)Sort the list elements according to the average score in ascending order and print just 3rd one
    public static List<Course> sortTheElementsByAscendingThengGetThird(List<Course> l) {
        return l.stream().sorted(Comparator.comparing(Course::getAvarageScore)).skip(2).limit(1).collect(Collectors.toList());

    }



}