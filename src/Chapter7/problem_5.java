package Chapter7;

public class problem_5 {
	
	/**
	 * Returns the most common number or one the most common in an array of integers given a range from 0 to 100, or -1 if none is found
	 * 
	 * @param nums
	 * @return
	 */
	public static int getMostCommonNum(int[] nums) {
		int count[] = new int[101];
		for(int i=0;i<nums.length;i++)
			count[nums[i]]++;
		int mostCommon=-1;
		int track=-1;
		for(int i=0;i<count.length;i++)
			if(count[i]>mostCommon) {
				mostCommon=count[i];
				track=i;
			}
		return track;
	}
}
