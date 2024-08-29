package assignment7;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment7 {

    public static float[] importData(int n) {
        Scanner scanner = new Scanner(System.in);
        float[] arrays = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the "+i+" arrays : ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    public static void printData(float[] arrays) {
        for (float num : arrays) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static float findMax2(float[] arrays) {
        float max1 = Float.NEGATIVE_INFINITY, max2 = Float.NEGATIVE_INFINITY;
        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        return max2;
    }

    public static float[] deleteOddNumber(float[] arrays) {
        ArrayList<Float> tempList = new ArrayList<>();
        
        for (float num : arrays) {
            if (num % 2 == 0) {
                tempList.add(num);
            }
        }

        float[] result = new float[tempList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = tempList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = scanner.nextInt();
        
        float[] arrays = importData(n);

        printData(arrays);
        System.out.println("Second largest: " + findMax2(arrays));
        arrays = deleteOddNumber(arrays);
        System.out.println("Delete odd numbers : ");
        printData(arrays);
    }
}
