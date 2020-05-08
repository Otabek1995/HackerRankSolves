package leetcodeEasy;

import util.ListNode;

public class MergeTwoSortedLists {

	public ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {

		if (l1.val < l2.val) {

			l1.next = mergeTwoSortedLists(l1.next, l2);
			return l1;

		} else {

			l2.next = mergeTwoSortedLists(l1, l2.next);
			return l2;
		}
	}
}