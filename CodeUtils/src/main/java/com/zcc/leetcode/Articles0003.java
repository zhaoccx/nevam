package com.zcc.leetcode;

import java.util.HashSet;
import java.util.Set;

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
		return 0;
	}

	public int lengthOfLongestSubstring_one(String s) {
		int n = s.length();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				// 两层循环，字符串中没有重复的对比大小
				if (allUnique(s, i, j)) {
					ans = Math.max(ans, j - i);
				}
			}

		}
		return ans;
	}

	/**
	 * 判断字符串中有没有重复的字符
	 * 
	 * @author SYSTEM
	 * @time 2018年8月13日 下午2:37:21
	 * @param s
	 * @param i
	 * @param j
	 * @return
	 * @path
	 * @parent
	 */
	private boolean allUnique(String s, int start, int end) {
		Set<Character> set = new HashSet<>();
		for (int i = start; i < end; i++) {
			Character ch = s.charAt(i);
			if (set.contains(ch)) {
				return false;
			}
			set.add(ch);
		}
		return true;
	}

	public int lengthOfLongestSubstring_two(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		while (i < n && j < n) {
			// try to extend the range [i, j]
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
			System.err.println(set);
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(new Articles0003().lengthOfLongestSubstring_one("abcpyutdabcdef"));
		System.out.println(new Articles0003().lengthOfLongestSubstring_two("abcpyutdabcdef"));
	}
}
