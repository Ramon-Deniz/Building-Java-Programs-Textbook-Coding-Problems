package Main;

import Chapter11.Problem_2;
import java.util.ArrayList;
import java.util.LinkedList;

public class main {

    public static void main(String args[]) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("aa");
        words.add("bb");
        words.add("cc");
        System.out.println(words);
        LinkedList<String> words2 = new LinkedList<String>();
        words2.add("zz");
        words2.add("yy");
        words2.add("xx");
        System.out.println(words2);
        System.out.println(Problem_2.alternate(words, words2));
    }
}
