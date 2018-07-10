package com.zcc.leetcode;

import java.util.ArrayList;
import java.util.List;

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
}
