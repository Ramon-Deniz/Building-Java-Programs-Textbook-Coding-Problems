package Chapter12;

/**
 *
 * @author ramon
 */
public class Problem_2 {
    /**
     * Prints numbers in sequential order based on the parameter starting from the number one.
     * 
     * @param number 
     */
    public static void writeNums(int number){
        if(number>1){
            writeNums(number-1);
        }
        System.out.print(number+" ");
    }
}
