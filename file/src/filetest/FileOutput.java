package filetest;
import java.awt.Desktop;
import java.io.*;

public class FileOutput {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        PrintStream output = new PrintStream(new File("D:\\output.txt"));
        File file = new File("D:\\output.txt");
        output.print("hello word ");
        Desktop desktop = Desktop.getDesktop();
        desktop.open(file);   
    }
}
