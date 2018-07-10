package com.zcc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * 
 * @author zhaocc
 * @time Jul 9, 2018 4:51:05 PM
 * @parent
 */
public class Articles0002 {
	/**
	 * leetcode
	 * 
	 * @author zhaocc
	 * @time Jul 10, 2018 6:22:58 PM
	 * @param l1
	 * @param l2
	 * @return
	 * @path
	 * @parent
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(-1);
		ListNode cur = dummy;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int d1 = l1 == null ? 0 : l1.val;
			int d2 = l2 == null ? 0 : l2.val;
			int sum = d1 + d2 + carry;
			carry = sum >= 10 ? 1 : 0;
			cur.next = new ListNode(sum % 10);
			cur = cur.next;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}
		if (carry == 1)
			cur.next = new ListNode(1);
		return dummy.next;
	}

	@Test
	public void testaddTwoNumbers() {
		ListNode l1 = new ListNode(2);
		System.err.println(l1.val);
		l1.next = new ListNode(4);
		System.err.println(l1.next.val);
		l1.next.next = new ListNode(3);
		System.err.println(l1.next.next.val);
		System.err.println(Arrays.toString(l1.getArray()));
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		System.err.println(Arrays.toString(l2.getArray()));
		System.out.println(Arrays.toString(addTwoNumbers(l1, l2).getArray()));
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}

	int[] getArray() {
		List<Integer> list = new ArrayList<>();
		ListNode temp = this;
		while (null != temp) {
			list.add(temp.val);
			temp = temp.next;
		}
		int[] ssss = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ssss[i] = list.get(i);
		}
		return ssss;
	}
}