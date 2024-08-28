package assignment5;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] a = {11, 42, -5, 27, 0, 89};
        
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        
        System.out.println(Arrays.toString(a));
    }
}
