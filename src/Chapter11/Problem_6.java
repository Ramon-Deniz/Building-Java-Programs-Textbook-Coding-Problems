package Chapter11;

import java.util.HashSet;
import java.util.List;

public class Problem_6 {

    /**
     * Returns the amount of unique numbers in a list.
     *
     * @param list
     * @return int
     */
    public static int countUnique(List<Integer> list) {
        HashSet<Integer> unique = new HashSet<>();
        for (int n : list) {
            unique.add(n);
        }
        return unique.size();
    }
}
