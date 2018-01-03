package Main;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

import Chapter6.counting_words;
import Chapter6.problem_12;
import Chapter7.problem_1;
import Chapter7.problem_5;
import Chapter8.RationalNumber;
import Chapter9.*;

public class main {

    public static void main(String args[]) {
        try {
            Cube newShape = new Cube(3);
            System.out.println(newShape.getVolume());
            System.out.println(newShape.getHeight());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
