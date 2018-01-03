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
            System.out.println(newShape.getSurfaceArea());
            System.out.println();
            RectangularPrism newShape2 = new RectangularPrism(3,4,5);
            System.out.println(newShape2.getVolume());
            System.out.println(newShape2.getSurfaceArea());
            System.out.println();
            Sphere newShape3 = new Sphere(4);
            System.out.println(newShape3.getVolume());
            System.out.println(newShape3.getSurfaceArea());
            System.out.println();
            Cylinder newShape4 = new Cylinder(3,7);
            System.out.println(newShape4.getVolume());
            System.out.println(newShape4.getSurfaceArea());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
