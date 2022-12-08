package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public  class Test2 {
    public static void readTheText() throws Exception {
        FileInputStream fis = new FileInputStream("src\\main\\java\\day26exceptions\\File01.txt");
        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
    }
}