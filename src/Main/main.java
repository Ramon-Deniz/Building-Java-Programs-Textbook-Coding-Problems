package Main;

import java.io.File;

import Main.Chapter6.counting_words;
import Main.Chapter6.problem_12;

public class main {
	public static void main(String args[]) {
		// Starting point
		
		//----------problem_12--------------
		/*
		 * 
		try {
			problem_12.removeHTMLTags(new File("/home/miguel/eclipse-workspace/Projects/src/Main/Chapter6/htmlTags.txt"));
			
		} catch (NullPointerException e) {
			System.out.println("File Not Found");
		}
		
		*/
		
		//----------counting_words--------------
		try {
			counting_words.beginCount(new File("/home/miguel/eclipse-workspace/Projects/src/countingWordsDocument.txt"));
			System.out.println("Word count: "+counting_words.getWordCount());
			System.out.println("Line count: "+counting_words.getLineCount());
			System.out.println("Char count: "+counting_words.getCharCount());
		}
		
		catch(NullPointerException e){
			System.out.println("File Not Found");
		}
		
	}
}