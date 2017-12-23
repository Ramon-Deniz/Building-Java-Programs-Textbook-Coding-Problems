package Main;

import java.io.File;
import java.io.FileNotFoundException;

import Main.Chapter6.problem_12;

public class main {
	public static void main(String args[]) {
		// Starting point
		try {
			problem_12.removeHTMLTags(new File("/home/miguel/eclipse-workspace/Projects/src/Main/Chapter6/htmlTags.txt"));
			
		} catch (NullPointerException e) {
			System.out.println("File Not Found");
		}
	}
}
