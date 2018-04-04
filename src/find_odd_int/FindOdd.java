package find_odd_int;

import java.util.TreeSet;

/**
 * Find The Odd Int
 * <p>
 * Given an array, find the int that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times
 * <p>
 * https://www.codewars.com/kata/find-the-odd-int/train/java
 * Created by andrewgarner on 4/3/18.
 */
class FindOdd {

    /**
     * Solution 1.
     * Works by utilizing XOR to flip bits for each number. All even-count numbers will effectively undo their own
     * XOR, leaving the one odd number's bits remaining -- telling us which number is of odd count.
     */
    static int solve1(int[] arr) {
        int rem = 0;
        for (int element : arr) {
            rem ^= element;
        }
        return rem;
    }

    /**
     * Solution 0.
     */
    static int solve0(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        return set.first();
    }
}
