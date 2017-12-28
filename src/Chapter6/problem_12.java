package Chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class problem_12 {
	public static void removeHTMLTags(File f) {
		try {
			Scanner scan = new Scanner(f);
			while (scan.hasNextLine()) {
				letters = scan.nextLine().toCharArray();
				for (int i = 0; i < letters.length; i++) {
					if (letters[i] == '<') {
						int index = findEndTagIndex(i);
						if(index>=letters.length)
							break;
						i=index;
					}
					System.out.print(letters[i]);
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

	public static int findEndTagIndex(int index) {
		while(letters[index++]!='>') ;
		return index;
	}

	public static char[] letters;
	
}
