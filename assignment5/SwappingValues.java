package assignment5;

public class SwappingValues {
    public static void main(String[] args) {
        int a = 7;
        int b = 35;
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
