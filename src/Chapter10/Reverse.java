
package Chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse {

    /**
     * Takes a file that places the lines and words in reverse order.
     *
     * @param fileLocation
     * @return
     * @throws FileNotFoundException
     */
    public static ArrayList<String> getReversedFile(String fileLocation) throws FileNotFoundException {
        
        ArrayList<String> fileToArrayList = new ArrayList<String>();
        Scanner scanLine = new Scanner(new File(fileLocation));
        
        while (scanLine.hasNextLine()) {
            
            Scanner scanNext = new Scanner(scanLine.nextLine());
            ArrayList<String> fileLineToWords = new ArrayList<String>();

            while (scanNext.hasNext()) {
                fileLineToWords.add(scanNext.next());
            }

            Collections.reverse(fileLineToWords);
            fileToArrayList.add(fileLineToWords.toString());
            
        }
        
        Collections.reverse(fileToArrayList);
        return fileToArrayList;
    }

}
