
package filetest;
import java.io.*;
import java.util.Scanner;
public class errorTest {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("D:\\test1.txt"));
        String text = sc.next();
        System.out.println(text);
    }
}
