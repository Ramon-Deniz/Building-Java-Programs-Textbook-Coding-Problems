package Chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class counting_words {

	public static void beginCount(File f) {
		wordCount=0;
		lineCount=0;
		charCount=0;
		try {
			Scanner scanLine = new Scanner(f);
			while(scanLine.hasNextLine()) {
				Scanner scanWords = new Scanner(scanLine.nextLine());
				while(scanWords.hasNext()) {
					wordCount++;
					charCount+=scanWords.next().length();
				}
				lineCount++;
			}
		}
		
		catch(FileNotFoundException e) {
			System.out.println("File Not Found( count_words.beginCount() )");
		}
	}
	
	public static int getWordCount() {
		return wordCount;
	}
	
	public static int getLineCount() {
		return lineCount;
	}
	
	public static int getCharCount() {
		return charCount;
	}
	
	public static int wordCount;
	public static int lineCount;
	public static int charCount;
}
