package unique_number;

/**
 * Find the unique number
 * <p>
 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
 * It’s guaranteed that array contains more than 3 numbers.
 * <p>
 * The tests contain some very huge arrays, so think about performance.
 * <p>
 * 6 kyu
 * https://www.codewars.com/kata/find-the-unique-number-1/train/java
 * Created by andrewgarner on 4/8/18.
 */
public class UniqueNumber {

    static double findUniq(double arr[]) {
        double repeated = arr[0];
        if (repeated != arr[1]) {
            if (repeated == arr[2]) {
                return arr[1];
            } else {
                return repeated;
            }
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != repeated) {
                return arr[i];
            }
        }
        return -1;
    }
}
