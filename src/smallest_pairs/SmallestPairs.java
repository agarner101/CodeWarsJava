package smallest_pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find K Pairs with Smallest Sums.
 * <p>
 * You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.
 * Define a pair (u,v) which consists of one element from the first array and one element from the second array.
 * Find the k pairs (u1, v1), (u2, v2) ... (uk, vk) with the smallest sums.
 * <p>
 * Example:
 * Given nums1 = [1, 7, 11], nums2 = [2, 4, 6], k = 3
 * Return: [1, 2], [1, 4], [1,6]
 * <p>
 * Andrew Garner 2018.
 */
public class SmallestPairs {

    public static void main(String[] args) {

        //Example 2
        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{3, 4};
        int k = 3;

        for (int[] val : smallestPairs0(arr1, arr2, k)) {
            System.out.println(Arrays.toString(val));
        }
    }

    /**
     * Solution using Streams. Second Solution
     */
    static List<int[]> smallestPairs1(int[] nums1, int[] nums2, int k) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        return list1.stream()
                // Create pairs of arr1 and arr2 values
                .flatMap(i -> list2.stream().map(j -> new int[]{i, j}))
                // Sort based on sum of a pair
                .sorted((Comparator.comparingInt(o -> o[0] + o[1])))
                // Reduce to k number of pairs
                .limit(k)
                // create a list
                .collect(Collectors.toList());
    }

    /**
     * Given two arrays {@code arr1} and {@code arr2}, returns {@code k} number of pairs of values from the two arrays
     * that have the lowest combined sum, in ascending order.
     * Returned is a list of pairs in the form (u, v), where u is an element of arr1 and v is an element of arr2.
     * First Solution.
     */
    static List<int[]> smallestPairs0(int[] nums1, int[] nums2, int k) {
        List<int[]> retList = new ArrayList<>();

        int totalPairCount = nums1.length * nums2.length;
        k = Math.min(k, totalPairCount); //Don't attempt to find more pairs than total

        // For each element in arr1, keep track of its current position traversing arr2 for pairs
        int[] positionI = new int[nums1.length];

        while (k > 0) {
            // Tracks the index of the pair with the lowest sum
            int minimumIndex = 0;
            // Tracks the minimum sum of pairs in this iteration
            int minimumSum = Integer.MAX_VALUE;

            for (int i = 0; i < nums1.length; i++) {
                if (positionI[i] >= nums2.length) continue;

                int val1 = nums1[i];
                int val2 = nums2[positionI[i]];
                int currentSum = val1 + val2;

                if (currentSum < minimumSum) {
                    minimumSum = currentSum;
                    minimumIndex = i;
                }
            }

            // Create a pair using the minimum index and its position in arr2 traversal
            int[] minPair = new int[]{nums1[minimumIndex], nums2[positionI[minimumIndex]]};
            retList.add(minPair);

            // Move position of arr2 traversal forward, effectively removing that value from further consideration
            positionI[minimumIndex]++;
            k--;
        }

        return retList;
    }
}
