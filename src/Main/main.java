package Main;

import Chapter10.Reverse;
import java.io.FileNotFoundException;

public class main {

    public static void main(String args[]) {
        try {
            System.out.println(Reverse.getReversedFile("src/countingWordsDocument.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
