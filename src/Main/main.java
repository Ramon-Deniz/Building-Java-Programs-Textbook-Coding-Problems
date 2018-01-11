package Main;

import Chapter11.Problem_6;
import Chapter11.Problem_7;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class main {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        Random rand = new Random();
        for(int i=0;i<rand.nextInt(25)+10;i++){
            list.add(rand.nextInt(10)+1);
        }
        System.out.println(list);
        for(int i=0;i<rand.nextInt(25)+10;i++){
            list2.add(rand.nextInt(10)+1);
        }
        System.out.println(list2);
        System.out.println();
        System.out.println(Problem_7.countCommon(list,list2));
        System.out.println();
        System.out.println(Problem_6.countUnique(list));
    }
}
