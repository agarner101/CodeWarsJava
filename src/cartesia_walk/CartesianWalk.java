package cartesia_walk;

/**
 * Cartesian Walk
 * <p>
 * You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early
 * to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with
 * a Walk Generating App on their phones -- every time you press the button it sends you an array of one-letter
 * strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You know it takes you one minute to traverse
 * one city block, so create a function that will return true if the walk the app gives you will take you exactly
 * ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point.
 * Return false otherwise
 * <p>
 * https://www.codewars.com/trainer/java
 * <p>
 * Created by andrewgarner on 4/2/18.
 */
public class CartesianWalk {

    /**
     * Solution 0
     */
    static boolean solve0(char[] walk) {
        if (walk.length != 10) return false;
        int x = 0;
        int y = 0;
        for (char c : walk) {
            switch (c) {
                case 'n': y++; break;
                case 's': y--; break;
                case 'e': x++; break;
                case 'w': x--; break;
            }
        }
        return x == 0 && y == 0;
    }
}
