package Chapter7;

import java.util.Arrays;

public class problem_1 {
	/**
	 * Returns the sum of two arrays made up of integers
	 * 
	 * @param num
	 * @param num2
	 * @return int[]
	 */
	public static int[] getSum(int[] num, int[] num2) {
		if (num.length > num2.length)
			return calculate(num, num2);
		return calculate(num2, num);
	}

	private static int[] calculate(int[] num, int[] num2) {
		int sum[] = new int[num.length + 1];
		int indexNum = num.length - 1;
		int indexNum2 = num2.length - 1;
		while (indexNum2 >= 0) {
			sum[indexNum] = (num[indexNum] + num2[indexNum2]) / 10;
			sum[indexNum + 1] = (sum[indexNum + 1] + num[indexNum--] + num2[indexNum2--]) % 10;
		}
		while (indexNum >= 0)
			sum[indexNum + 1] = (sum[indexNum + 1] + num[indexNum--]) % 10;

		return sum;
	}


}




