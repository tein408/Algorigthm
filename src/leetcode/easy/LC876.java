package leetcode.easy;

public class LC876 {

    public ListNode middleNode(ListNode head) {
        ListNode left = head;
        ListNode right = head;
        while(true) {
            if(right == null || right.next == null)
                break;
            left = left.next;
            right = right.next.next;
        }
        return left;
    }

}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
