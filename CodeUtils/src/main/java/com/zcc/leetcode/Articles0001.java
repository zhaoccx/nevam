package com.zcc.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。 复杂度分析： 时间复杂度： O(n2)O(n^2) O(n ​2 ​​)， 对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n)O(n) O(n) 的时间。因此时间复杂度为 O(n2)O(n^2) O(n ​2 ​​)。 空间复杂度： O(1)O(1) O(1)。
 * 
 * @author zhaocc
 * @time Jul 9, 2018 2:45:27 PM
 * @parent
 * @url https://leetcode-cn.com/articles/two-sum/
 */
public class Articles0001 {

	/**
	 * 假设都是正整数，目标数也大于0
	 * 
	 * @author zhaocc
	 * @time Jul 9, 2018 2:55:20 PM
	 * @param nums
	 * @param target
	 * @return
	 * @path
	 * @parent
	 */
	public int[] twoSum(int[] nums, int target) {

		int tempindex = 0;
		if (target <= 0 || nums.length <= 1) {
			System.err.println("输入参数有误！");
			return null;
		}
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= target) {
				tempindex = target - nums[i];
			}
			for (int j = i; j < nums.length; j++) {
				if (nums[j] == tempindex) {
					return new int[] { i, j };
				}
			}
			System.out.println(i + " : " + nums[i]);
		}

		return null;
	}

	/**
	 * 暴力法很简单。遍历每个元素 x，并查找是否存在一个值与target−x 相等的目标元素。 复杂度分析： 时间复杂度：O(n^2， 对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n) 的时间。因此时间复杂度为 O(n^2)。 空间复杂度：O(1)。
	 * 
	 * @author leetcode
	 * @time Jul 9, 2018 3:55:03 PM
	 * @param nums
	 * @param target
	 * @return
	 * @path
	 * @parent
	 */
	public int[] twoSumOne(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	/**
	 * 方法二：两遍哈希表 为了对运行时间复杂度进行优化，我们需要一种更有效的方法来检查数组中是否存在目标元素。如果存在，我们需要找出它的索引。保持数组中的每个元素与其索引相互对应的最好方法是什么？哈希表。 通过以空间换取速度的方式，我们可以将查找时间从 O(n)O(n) O(n) 降低到 O(1)O(1) O(1)。哈希表正是为此目的而构建的，它支持以 近似 恒定的时间进行快速查找。我用“近似”来描述，是因为一旦出现冲突，查找用时可能会退化到 O(n)O(n) O(n)。但只要你仔细地挑选哈希函数，在哈希表中进行查找的用时应当被摊销为 O(1)O(1) O(1)。 一个简单的实现使用了两次迭代。在第一次迭代中，我们将每个元素的值和它的索引添加到表中。然后，在第二次迭代中，我们将检查每个元素所对应的目标元素（ target−nums[i]target - nums[i]
	 * target−nums[i]）是否存在于表中。注意，该目标元素不能是 nums[i]nums[i] nums[i] 本身！
	 * 
	 * @author leetcode
	 * @time Jul 9, 2018 4:16:41 PM
	 * @param nums
	 * @param target
	 * @return
	 * @path
	 * @parent
	 */
	public int[] twoSumuseMap(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	/**
	 * 方法三：一遍哈希表 事实证明，我们可以一次完成。在进行迭代并将元素插入到表中的同时，我们还会回过头来检查表中是否已经存在当前元素所对应的目标元素。如果它存在，那我们已经找到了对应解，并立即将其返回。
	 * 
	 * @author leetcode
	 * @time Jul 9, 2018 4:20:00 PM
	 * @param nums
	 * @param target
	 * @return
	 * @path
	 * @parent
	 */
	public int[] twoSumuseMap2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
