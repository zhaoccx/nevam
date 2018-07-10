package com.zcc.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
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
