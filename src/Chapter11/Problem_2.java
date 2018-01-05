
package Chapter11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Problem_2 {
    
    /**
     * Returns a list that contains alternating elements from two lists.
     * 
     * @param words
     * @param words2
     * @return LinkedList<String>
     */
    public static LinkedList<String> alternate(List<String> words,List<String> words2){
        
        LinkedList<String> combinedLists = new LinkedList<>();
        Iterator<String> wordsIterator = words.iterator();
        Iterator<String> wordsIterator2 = words2.iterator();
        
        while(wordsIterator.hasNext() && wordsIterator2.hasNext()){
            combinedLists.add(wordsIterator.next());
            combinedLists.add(wordsIterator2.next());
        }
        
        while(wordsIterator.hasNext()){
            combinedLists.add(wordsIterator.next());
        }
        
        while(wordsIterator2.hasNext()){
            combinedLists.add(wordsIterator2.next());
        }
        
        return combinedLists;
    }
    
}
