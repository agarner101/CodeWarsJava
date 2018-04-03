package digital_root;

/**
 * Digital Root
 * <p>
 * A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n.
 * If that value has two digits, continue reducing in this way until a single-digit number is produced.
 * This is only applicable to the natural numbers.
 * <p>
 * https://www.codewars.com/kata/541c8630095125aba6000c00/train/java
 * Created by andrewgarner on 4/2/18.
 */
class DigitalRoot {

    /**
     * Attempt 2. Using the Congruence Formula (http://mathworld.wolfram.com/DigitalRoot.html)
     * Removes loop and recursion -- uses simple formula.
     */
    static int solve2(int n) {
        return 1 + (n - 1) % 9;
    }

    /**
     * Attempt 1.
     * Removes loop but adds extra recursion
     */
    static int solve1(int n) {
        if (n < 10) return n;
        return solve1(solve1(n / 10) + n % 10);
    }

    /**
     * Attempt 0
     */
    static int solve0(int n) {
        int sum = 0;
        while (true) {
            int rem = n % 10; //Parse last digit of number
            sum += rem; //Add last digit to sum
            if (n == rem) {
                break; //True when there is only a single digit remaining
            }
            n = n / 10; //Divide by 10 to remove last digit
        }
        if (sum >= 10) {
            return solve0(sum); //Double digit or more means we need to break the number down further
        } else {
            return sum; //Single digit means we are done
        }
    }
}
