package assignment5;

import java.util.Arrays;

public class TheLengthField {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
            //System.out.println(numbers[i]);
        }
        System.out.print(Arrays.toString(numbers));
    }
}
