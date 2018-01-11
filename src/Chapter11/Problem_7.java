package Chapter11;

import java.util.HashSet;
import java.util.List;

public class Problem_7 {

    /**
     * Returns the amount of common numbers between two lists.
     *
     * @param list
     * @param list2
     * @return int
     */
    public static int countCommon(List<Integer> list, List<Integer> list2) {
        HashSet<Integer> common = new HashSet<>();
        for (int n : list) {
            if (list2.contains(n)) {
                common.add(n);
            }
        }
        System.out.println(common);
        return common.size();
    }
}
