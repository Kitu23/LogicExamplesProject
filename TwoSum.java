import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] twoSumArr = { 2, 7, 11, 15 };
		System.out.println("two sum araray " + Arrays.toString(twoSumArr) + " for taget 9 is "
				+ Arrays.toString(findTwoSum(twoSumArr, 9)));
	}

	private static int[] findTwoSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (numMap.containsKey(complement)) {
				return new int[] { numMap.get(complement), i };
			} else {
				numMap.put(nums[i], i);
			}
		}
		return new int[] {};
	}
}
