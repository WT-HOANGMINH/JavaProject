
package filetest;
import java.awt.Desktop;
import java.io.*;
import java.util.Scanner;
public class HoursFIleOutput {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("D:\\output.txt");
        PrintStream output = new PrintStream(file);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : "); String name = sc.nextLine();
        System.out.println("Enter id : "); String id = sc.nextLine();
        int check=0,day=0; 
        double hour , sum  = 0;
        while(check == 0){
        System.out.println("day "+day+" enter hours :"); day++; hour = sc.nextDouble();
        sum+=hour;
            System.out.println("continue : [?] press 0 / out press 1 : "); check = sc.nextInt();
        }
        output.print(name+" ID: "+id+" worked : "+sum+" ("+sum/day+" hours/day )");
        Desktop desktop = Desktop.getDesktop();
        desktop.open(file); 
    }
}
