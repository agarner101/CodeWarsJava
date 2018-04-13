package smallest_pairs;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

/**
 * Tests for {@link SmallestPairs}.
 * Created by andrewgarner 2018.
 */
public class SmallestPairsTest extends TestCase {

    /**
     * Tests pairs returned from a solution.
     */
    private void testResult(List<int[]> expected, List<int[]> actual) throws Exception {
        Assert.assertEquals("Size should match", expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            int[] expectedPair = expected.get(i);
            int[] actualPair = actual.get(i);
            String message = String.format("Pairs must be equal.\nExpected: %s\nActual:   %s",
                    Arrays.toString(expectedPair), Arrays.toString(actualPair));
            Assert.assertTrue(message, Arrays.equals(expectedPair, actualPair));
        }
    }

    /**
     * Example 1 Test
     */
    public void testExample1() throws Exception {
        int[] nums1 = new int[]{1, 7, 11};
        int[] nums2 = new int[]{2, 4, 6};
        int k = 3;

        int[][] expectedArray = new int[][] {
                new int[] {1, 2},
                new int[] {1, 4},
                new int[] {1, 6},
        };

        List<int[]> expected = Arrays.asList(expectedArray);
        List<int[]> actual = SmallestPairs.smallestPairs0(nums1, nums2, k);

        testResult(expected, actual);
    }

    /**
     * Example 2 Test
     */
    public void testExample2() throws Exception {
        int[] nums1 = new int[]{1, 1, 2};
        int[] nums2 = new int[]{1, 2, 3};
        int k = 2;

        int[][] expectedArray = new int[][] {
                new int[] {1, 1},
                new int[] {1, 1},
        };

        List<int[]> expected = Arrays.asList(expectedArray);
        List<int[]> actual = SmallestPairs.smallestPairs0(nums1, nums2, k);

        testResult(expected, actual);
    }

    /**
     * Example 3 Test
     */
    public void testExample3() throws Exception {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3};
        int k = 3;

        int[][] expectedArray = new int[][] {
                new int[] {1, 3},
                new int[] {2, 3},
        };

        List<int[]> expected = Arrays.asList(expectedArray);
        List<int[]> actual = SmallestPairs.smallestPairs0(nums1, nums2, k);

        testResult(expected, actual);
    }

    /**
     * Tests empty inputs
     */
    public void testEmptyNums() throws Exception {
        int[] nums1 = new int[]{};
        int[] nums2 = new int[]{};
        int k = 3;

        int[][] expectedArray = new int[][] {};

        List<int[]> expected = Arrays.asList(expectedArray);
        List<int[]> actual = SmallestPairs.smallestPairs0(nums1, nums2, k);

        testResult(expected, actual);
    }

    /**
     * Tests Negative K
     */
    public void testNegativeK() throws Exception {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3};
        int k = -1;

        int[][] expectedArray = new int[][] {};

        List<int[]> expected = Arrays.asList(expectedArray);
        List<int[]> actual = SmallestPairs.smallestPairs0(nums1, nums2, k);

        testResult(expected, actual);
    }

    /**
     * Tests Negative value in nums1
     */
    public void testNegativeValue() throws Exception {
        int[] nums1 = new int[]{-1, 2};
        int[] nums2 = new int[]{3, 4};
        int k = 3;

        int[][] expectedArray = new int[][] {
                new int[] {-1, 3},
                new int[] {-1, 4},
                new int[] {2, 3},
        };

        List<int[]> expected = Arrays.asList(expectedArray);
        List<int[]> actual = SmallestPairs.smallestPairs0(nums1, nums2, k);

        testResult(expected, actual);
    }

}