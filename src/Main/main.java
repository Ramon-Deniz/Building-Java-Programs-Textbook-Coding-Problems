package Main;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

import Chapter6.counting_words;
import Chapter6.problem_12;
import Chapter7.problem_1;
import Chapter7.problem_5;
import Chapter8.RationalNumber;

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
		
		//----------problem_5--------------
		/*
		 * 
		Random rand = new Random();
		int nums[] = new int[10];
		for(int i=0;i<nums.length;i++)
			nums[i]=rand.nextInt(5);
		System.out.println(problem_5.getMostCommonNum(nums));
		System.out.print(Arrays.toString(nums));
		
		*/
		
		//----------problem_1--------------
		/*

		Random rand = new Random();
		int num[] = new int[100];
		int num2[] = new int[100];
		for(int i=0;i<num.length;i++) {
			num[i]=rand.nextInt(9);
			System.out.print(num[i]);
		}
		System.out.println();
		for (int i = 0; i < num.length - num2.length; i++)
			System.out.print(" ");
		for(int i=0;i<num2.length;i++) {
			num2[i]=rand.nextInt(9);
			System.out.print(num2[i]);
		}
		long start = System.nanoTime();
		System.out.println();
		int sum[] = problem_1.getSum(num, num2);
		for(int i=0;i<sum.length;i++) 
			System.out.print(sum[i]);
		System.out.println("-------"+(System.nanoTime()-start)/100000);
		
		*/
		try {
			RationalNumber test = new RationalNumber();
			test.divide(56, 122);
			System.out.println(test);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Denominator can not equal zero");
		}
		
	}
}