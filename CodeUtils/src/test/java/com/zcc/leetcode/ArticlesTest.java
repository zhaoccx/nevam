package com.zcc.leetcode;

import java.util.Arrays;

import org.junit.Test;

public class ArticlesTest {

	@Test
	public void testArticles0001() {
		Articles0001 articles0001 = new Articles0001();
		int[] nums = { 3, 6, 2, 13, 7, 11, 15 };
		int target = 13;
		System.out.println(Arrays.toString(articles0001.twoSum(nums, target)));
		System.out.println(Arrays.toString(articles0001.twoSumOne(nums, target)));
		System.out.println(Arrays.toString(articles0001.twoSumuseMap(nums, target)));
		System.out.println(Arrays.toString(articles0001.twoSumuseMap2(nums, target)));
	}

	@Test
	public void testArticles0002() {
		Articles0002 articles0002 = new Articles0002();
		ListNode l1 = new ListNode(8);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(1);
		ListNode l2 = new ListNode(6);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(6);
		System.out.println(Arrays.toString(articles0002.addTwoNumbers(l1, l2).getArray()));
	}
}
