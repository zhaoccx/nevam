package com.zcc.leetcode;

/**
 * 
 * @author leetcode
 * @time Jul 9, 2018 4:51:05 PM
 * @parent
 */
public class Articles0002 {
	/**
	 * leetcode
	 * 
	 * @author leetcode
	 * @time Jul 10, 2018 6:22:58 PM
	 * @param listnodeone
	 * @param listnodeother
	 * @return
	 * @path
	 * @parent
	 */
	public ListNode addTwoNumbers(ListNode listnodeone, ListNode listnodeother) {
		ListNode templistnode = new ListNode(-1); // 初始化node
		ListNode currlistnode = templistnode; // 当前node
		int carry = 0;
		while (null != listnodeone || null != listnodeother) {
			int d1 = listnodeone == null ? 0 : listnodeone.val;
			int d2 = listnodeother == null ? 0 : listnodeother.val;
			int sum = d1 + d2 + carry;
			carry = sum >= 10 ? 1 : 0;
			currlistnode.next = new ListNode(sum % 10);
			currlistnode = currlistnode.next;
			if (listnodeone != null) {
				System.out.println("l1.val:::::---->" + listnodeone.val);
				listnodeone = listnodeone.next;
			}
			if (listnodeother != null) {
				System.out.println("l2.val:::::---->" + listnodeother.val);
				listnodeother = listnodeother.next;
			}
			System.out.println("cur.next:::::----->" + currlistnode.val);
		}
		if (carry == 1)
			currlistnode.next = new ListNode(1);
		return templistnode.next;
	}

}
