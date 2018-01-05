package Chapter10;

import java.util.ArrayList;

public class Problem_2 {

    /**
     * Swaps pairs of values in an ArrayList of Strings. Ex: [Aa, Bb, Cc, Dd] will
     * turn into [Bb, Aa, Dd, Cc]. [Aa, Bb, Cc, Dd, Ee] will turn into [Bb, Aa, Dd, , Cc, Ee].
     *
     * @param words
     */
    public static void swapPairs(ArrayList<String> words) {
        for (int i = 1; i < words.size(); i += 2) {
            String temp = words.get(i);
            words.set(i, words.get(i - 1));
            words.set(i - 1, temp);
        }
    }

}
