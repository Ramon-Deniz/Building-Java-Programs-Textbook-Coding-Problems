package Main;

import Chapter13.Merge;
import java.util.Arrays;
import java.util.Random;

public class main {

    public static void main(String args[]) {
        int[] numbers = new int[1000];
        Random rand = new Random();
        for(int i=0;i<numbers.length;i++){
            numbers[i]=rand.nextInt(1000000);
        }
        System.out.println("Start");
        long start = System.currentTimeMillis();
        numbers = Merge.mergeSort(numbers);
        System.out.println("Finished: "+(System.currentTimeMillis()-start) );
    }
}
