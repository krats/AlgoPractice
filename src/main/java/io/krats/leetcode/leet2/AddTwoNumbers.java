package io.krats.leetcode.leet2;

public class AddTwoNumbers {
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null;
        ListNode curHead = null;
        while (l1 != null && l2 != null) {
            int cur = l1.val + l2.val + carry;
            if(cur >= 10) {
                carry = 1;
                cur %= 10;
            } else {
                carry = 0;
            }
            if(head == null) {
                head = new ListNode(cur);
                curHead = head;
            } else {
                curHead.next = new ListNode(cur);
                curHead = curHead.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int cur = l1.val + carry;
            if(cur >= 10) {
                carry = 1;
                cur %= 10;
            } else {
                carry = 0;
            }
            if(head == null) {
                head = new ListNode(cur);
                curHead = head;
            } else {
                curHead.next = new ListNode(cur);
                curHead = curHead.next;
            }
            l1 = l1.next;
        }
        while (l2 != null) {
            int cur = l2.val + carry;
            if(cur >= 10) {
                carry = 1;
                cur %= 10;
            } else {
                carry = 0;
            }
            if(head == null) {
                head = new ListNode(cur);
                curHead = head;
            } else {
                curHead.next = new ListNode(cur);
                curHead = curHead.next;
            }
            l2 = l2.next;
        }
        if(carry != 0) {
            curHead.next = new ListNode(carry);
        }
        return head;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
