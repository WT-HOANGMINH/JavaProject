
package filetest;
import java.awt.Desktop;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class InformationFileOutput {
    public static void main(String[] args) throws FileNotFoundException, IOException {
    Scanner sc = new Scanner(System.in);
    File file = new File("D:\\output.txt");
    PrintStream output = new PrintStream(file);
        System.out.println("Enter name : "); String name = sc.nextLine();
        System.out.println("Enter major : "); String major = sc.nextLine();
        System.out.println("Enter countryside : "); String countryside = sc.nextLine();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Enter date : "); date = sdf.parse(sc.nextLine());
        } catch (Exception e) {
        }
        output.print("Name : "+name+", Major : "+major+", CountrySide : "+countryside+", Date of birth : "+sdf.format(date));
        Desktop desktop = Desktop.getDesktop();
        desktop.open(file); 
    }  
}
