package multiples_3_or_5;

/**
 * Multiples of 3 or 5
 * <p>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9
 * The sum of these multiples is 23.
 * <p>
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 * <p>
 * https://www.codewars.com/kata/multiples-of-3-or-5/train/java
 * Created by andrewgarner on 4/8/18.
 */
class Multiples {

    static int solution(int n) {
        int result = 0;
        for (int i = 3; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}
