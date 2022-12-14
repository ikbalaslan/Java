package day33lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FunctionalProgramming06 {
    public static void main(String[] args) throws IOException {
        //How to read text from the file
        //Files.lines(Paths.get("src\\main\\java\\day26exceptions\\File01.txt")).forEach(System.out::println);
        System.out.println("==============");
        //How to convert all characters in the file to upper case
        //Files.lines(Paths.get("src\\main\\java\\day33lambda\\LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);


        //How to check if a specific word(Lambda) exists in the text
       boolean result = Files.lines(Paths.get("src\\main\\java\\day33lambda\\LambdaTextFile.txt")).anyMatch(t->t.contains("Lambda"));
       System.out.println(result);

        //************* Print distinct words on the console in the file *********
       //Files.lines(Paths.get("src\\main\\java\\day33lambda\\LambdaTextFile.txt")).map(t->t.split(" ")).flatMap(Arrays::stream).distinct().forEach(UtilsClass::printInTheSameLineWithASpace);

       //Get the words which end with "e" and print them on the console
        Files.lines(Paths.get("src\\main\\java\\day33lambda\\LambdaTextFile.txt"))
                .map(t->t.split(" "))
                .flatMap(Arrays::stream)
                .filter(t->t.endsWith("e"))
                .forEach(UtilsClass::printInTheSameLineWithASpace);


    }
}