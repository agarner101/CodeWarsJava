package is_divisible;

/**
 * Is n divisible by x and y?
 * Created by andrewgarner on 4/8/18.
 */
class IsDivisible {

    static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}
