package com.zcc.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author leetcode
 * @time Jul 9, 2018 4:51:05 PM
 * @parent
 */
public class Articles0003 {

	/**
	 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
	 * 
	 * @author SYSTEM
	 * @time 2018年8月6日 下午5:52:09
	 * @param s
	 * @return
	 * @path
	 * @parent
	 */
	public int lengthOfLongestSubstring(String s) {
		if (null == s || s.length() < 1) {
			return 0;
		}
		int tempint = 0;
		char[] array = s.toCharArray();
		List<int[]> list = new ArrayList<>();
		Map<Character, Integer> mapchar = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (!mapchar.containsKey(array[i])) {
				mapchar.put(array[i], i);
			} else {
				int[] temp = new int[2];
				temp[0] = mapchar.get(array[i]);
				temp[1] = i;
				list.add(temp);
				mapchar.put(array[i], i);
			}

		}
		System.err.println(mapchar);
		for (int i = 0; i < list.size(); i++) {
			tempint = list.get(i)[1] - list.get(i)[0] > tempint ? list.get(i)[1] - list.get(i)[0] : tempint;
		}
		System.out.println(tempint);
		return tempint;
	}

	public static void main(String[] args) {
		new Articles0003().lengthOfLongestSubstring("abcdabcdefg");
	}
}
