
package excercise_comparing;  // A
// Proof for all three algorithms:
// 1. Algorithm 1 generates random numbers until it finds one that is not in the array so far. 
//    This ensures that each element is unique, making the result a valid permutation. Since each random number is selected
//    with equal probability, all permutations are equally likely.

// 2. Algorithm 2 uses an additional 'used' array to track which numbers have already been used. This reduces the lookup time 
//    and still ensures that all numbers are unique. Again, since random numbers are selected with equal probability, 
//    all permutations are equally likely.

// 3. Algorithm 3 shuffles an already sorted array. Each swap is random, meaning all possible orders are equally likely 
//    with sufficient randomness in randInt. Thus, it produces valid and equally likely permutations.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PermutationAlgorithms {

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

    public static void main(String[] args) {
        int n = 5; // Example size

        System.out.println("Algorithm 1 result: " + algorithm1(n));
        System.out.println("Algorithm 2 result: " + algorithm2(n));
        System.out.println("Algorithm 3 result: " + algorithm3(n));
    }
}

