package assignment5;

public class AccessingElements {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        
        numbers[0] = 27;
        numbers[3] = -6;
        
        System.out.println(numbers[0]);
        if (numbers[3] < 0) {
            System.out.println("Element 3 is negative.");
        }
    }
}
