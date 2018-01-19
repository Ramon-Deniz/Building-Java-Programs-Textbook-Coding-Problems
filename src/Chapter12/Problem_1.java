
package Chapter12;

/**
 *
 * @author ramon
 */
public class Problem_1 {
    /**
     * Prints a string of asterisks that gets larger as the parameter becomes larger.
     * 
     * @param int power 
     */
    public static void starString(int power) {
        if (power == 0) {
            System.out.print("*");
            return;
        } else if (power < 0) {
            throw new IllegalArgumentException();
        }
        starString(power - 1);
        starString(power - 1);
    }
}
