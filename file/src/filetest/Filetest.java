package filetest;

import java.io.*;

public class Filetest {

    public static void main(String[] args) {
        File f = new File("D:\\test1.txt");
        
        System.out.println("size of file: " + f.length());
        
        if (f.exists() && f.length() > 1000) {
            System.out.println("size of file > 1000 bytes ");
        } else if (f.exists() && f.length() <= 1000) {
            System.out.println("size of file < 1000");
        } else {
            System.out.println("File does not exist");
        }
    }
}
