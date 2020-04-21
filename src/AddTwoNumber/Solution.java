package AddTwoNumber;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l11.next = l12;
        l12.next = l13;

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        l21.next = l22;
        Solution solution = new Solution();
        System.out.println(solution.addTwoNumbers(l11, l21));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode prevNode = null;
        ListNode nowNode = null;
        ListNode firstNode = null;
        while (l1 != null || l2 != null || carry!=0) {
            int val = 0;
            if (getVal(l1) + getVal(l2) + carry >= 10) {
                val = +getVal(l1) + getVal(l2) + carry - 10;
                carry = 1;
            } else {
                val = getVal(l1) + getVal(l2) + carry;
                carry=0;
            }
            nowNode = new ListNode(val);
            if (prevNode != null) {
                prevNode.next = nowNode;
            } else {
                firstNode = nowNode;
            }
            prevNode = nowNode;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if(l2==null && carry==0){
                prevNode.next=l1;
                break;
            }
            if(l1==null && carry==0){
                prevNode.next=l2;
                break;
            }
        }
        return firstNode;
    }

    public int getVal(ListNode listNode) {
        if (listNode == null) {
            return 0;
        } else {
            return listNode.val;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) { val = x; }

}
