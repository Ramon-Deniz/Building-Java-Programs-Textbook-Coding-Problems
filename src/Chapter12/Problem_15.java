package Chapter12;

/**
 *
 * @author ramon
 */
public class Problem_15 {
    /**
     * Returns an integer based on the amount of unique permutations between "r" items and a group of "n" items.
     * 
     * @param n
     * @param r
     * @return 
     */
    public static int permut(int n, int r){
        return permut(n)/permut(n-r);
    }
    
    private static int permut(int number){
        if(number<2){
            return 1;
        }
        return number*permut(number-1);
    }
}
