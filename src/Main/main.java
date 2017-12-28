package Main;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

import Chapter6.counting_words;
import Chapter6.problem_12;
import Chapter7.problem_5;

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
		/*
		 * try {
		 
			counting_words.beginCount(new File("src/countingWordsDocument.txt"));
			System.out.println("Word count: "+counting_words.getWordCount());
			System.out.println("Line count: "+counting_words.getLineCount());
			System.out.println("Char count: "+counting_words.getCharCount());
		}
		
		catch(NullPointerException e){
			System.out.println("File Not Found");
		}
		*/
		
		Random rand = new Random();
		int nums[] = new int[10];
		for(int i=0;i<nums.length;i++)
			nums[i]=rand.nextInt(5);
		System.out.println(problem_5.getMostCommonNum(nums));
		System.out.print(Arrays.toString(nums));
		
	}
}