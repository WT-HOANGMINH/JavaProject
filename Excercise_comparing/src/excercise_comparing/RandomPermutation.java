
package excercise_comparing;  // C

import java.util.*;

public class RandomPermutation {

    public static List<Integer> algorithm1(int n) {
        List<Integer> result = new ArrayList<>();
        Random rand = new Random();

        while (result.size() < n) {
            int num = rand.nextInt(n);
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static List<Integer> algorithm2(int n) {
        List<Integer> result = new ArrayList<>();
        boolean[] used = new boolean[n];
        Random rand = new Random();

        while (result.size() < n) {
            int num = rand.nextInt(n);
            if (!used[num]) {
                used[num] = true;
                result.add(num);
            }
        }
        return result;
    }

    public static List<Integer> algorithm3(int n) {
        List<Integer> result = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) {
            result.add(i);
        }

        Random rand = new Random();
        for (int i = 0; i < n; ++i) {
            int j = rand.nextInt(i + 1);
            Collections.swap(result, i, j);
        }

        return result;
    }

    public static void runAndCompareAlgorithms(int n, int iterations) {
        long totalTime1 = 0, totalTime2 = 0, totalTime3 = 0;

        for (int i = 0; i < iterations; ++i) {
            long start = System.nanoTime();
            algorithm1(n);
            long end = System.nanoTime();
            totalTime1 += (end - start);

            start = System.nanoTime();
            algorithm2(n);
            end = System.nanoTime();
            totalTime2 += (end - start);

            start = System.nanoTime();
            algorithm3(n);
            end = System.nanoTime();
            totalTime3 += (end - start);
        }

        System.out.println("For N=" + n + ":");
        System.out.println("Algorithm 1 average time: " + (totalTime1 / iterations) + " ns");
        System.out.println("Algorithm 2 average time: " + (totalTime2 / iterations) + " ns");
        System.out.println("Algorithm 3 average time: " + (totalTime3 / iterations) + " ns");

        if (totalTime1 < totalTime2 && totalTime1 < totalTime3) {
            System.out.println("Algorithm 1 is the fastest.");
        } else if (totalTime2 < totalTime1 && totalTime2 < totalTime3) {
            System.out.println("Algorithm 2 is the fastest.");
        } else {
            System.out.println("Algorithm 3 is the fastest.");
        }
    }

    public static void main(String[] args) {
        int[] ns = {250, 500, 1000, 2000, 25000, 50000, 100000};

        for (int n : ns) {
            runAndCompareAlgorithms(n, 10);
            System.out.println();
        }
    }
}

// d answer : 