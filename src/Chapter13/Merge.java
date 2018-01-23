package Chapter13;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ramon
 */
public class Merge {
    /**
     * Returns a sorted array.
     * 
     * @param numbers
     * @return 
     */
    public static int[] mergeSort(int[] numbers){
        int half=numbers.length/2;
        return mergeSort(Arrays.copyOfRange(numbers, 0, half),Arrays.copyOfRange(numbers, half, numbers.length));
    }
    
    private static int[] mergeSort(int[] nums, int[] nums2){
        if(nums.length>1){
            int half=nums.length/2;
            nums=mergeSort(Arrays.copyOfRange(nums, 0, half),Arrays.copyOfRange(nums, half, nums.length));
        }
        if(nums2.length>1){
            int half=nums2.length/2;
            nums2=mergeSort(Arrays.copyOfRange(nums2, 0, half),Arrays.copyOfRange(nums2, half, nums2.length));
        }
        return sort(nums,nums2);
    }
    
    private static int[] sort(int[] nums, int[] nums2){
        int index=0;
        int index2=0;
        int[] combined = new int[nums.length+nums2.length];
        while(index<nums.length && index2<nums2.length){
            if(nums[index]<nums2[index2]){
                combined[index+index2]=nums[index++];
            }
            else{
                combined[index+index2]=nums2[index2++];
            }
        }
        while(index<nums.length){
            combined[index+index2]=nums[index++];
        }
        while(index2<nums2.length){
            combined[index+index2]=nums2[index2++];
        }
        return combined;
    }
    
}
