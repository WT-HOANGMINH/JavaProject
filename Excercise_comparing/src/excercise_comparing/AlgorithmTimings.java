package excercise_comparing;  // B
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class AlgorithmTimings {

    public static ArrayList<Integer> algorithm1(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        Random rand = new Random();

        while (result.size() < n) {
            int num = rand.nextInt(n);
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static ArrayList<Integer> algorithm2(int n) {
        ArrayList<Integer> result = new ArrayList<>();
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

    public static ArrayList<Integer> algorithm3(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(i);
        }

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int j = rand.nextInt(i + 1);
            Collections.swap(result, i, j);
        }

        return result;
    }

    public static void runAndTimeAlgorithm(String algorithmName, int n, int iterations) {
        long startTime = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            if ("Algorithm1".equals(algorithmName)) {
                algorithm1(n);
            } else if ("Algorithm2".equals(algorithmName)) {
                algorithm2(n);
            } else if ("Algorithm3".equals(algorithmName)) {
                algorithm3(n);
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / iterations;
        System.out.println(algorithmName + " average time for N=" + n + ": " + duration + " ns");
    }

    public static void main(String[] args) {
        int[] ns1 = {250, 500, 1000, 2000};
        int[] ns2 = {25000, 50000, 100000, 200000, 400000, 800000};
        int[] ns3 = {100000, 200000, 400000, 800000, 1600000, 3200000, 6400000};

        System.out.println("Running Algorithm 1:");
        for (int n : ns1) {
            runAndTimeAlgorithm("Algorithm1", n, 10);
        }

        System.out.println("\nRunning Algorithm 2:");
        for (int n : ns2) {
            runAndTimeAlgorithm("Algorithm2", n, 10);
        }

        System.out.println("\nRunning Algorithm 3:");
        for (int n : ns3) {
            runAndTimeAlgorithm("Algorithm3", n, 10);
        }
    }
}
