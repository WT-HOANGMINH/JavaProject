package numberexcercise;

import java.util.*;

public class NumberExcercise {

    public static ArrayList<Integer> importData(int n) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the [" + i + "] element: ");
            int a = scanner.nextInt();
            arr.add(a);
        }
        return arr;
    }

    public static void printData(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("arr[" + i + "]: " + arrays[i]);
        }
    }

    public static int Max2(int[] arrays) {
        Arrays.sort(arrays);
        int max = arrays[arrays.length - 1];
        int max2 = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != max && arrays[i] > max2) {
                max2 = arrays[i];
            }
        }
        return max2;
    }

    public static void deleteOddNumber(int[] arrays) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : arrays) {
            arr.add(i);
        }
        arr.removeIf(n -> n % 2 != 0);
        System.out.println("After deleting odd numbers: " + Arrays.toString(arr.toArray()));
    }
}
