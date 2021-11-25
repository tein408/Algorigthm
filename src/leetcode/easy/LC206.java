package leetcode.easy;

public class LC206 {

    public ListNode206 reverseList(ListNode206 head) {
        if(head == null)
            return head;

        ListNode206 ans = null;
        ListNode206 temp = null;

        while(head != null) {
            temp = head;
            head = head.next;
            temp.next = ans;
            ans = temp;
        }
        return ans;
    }

}


//Definition for singly-linked list.
class ListNode206 {
    int val;
    ListNode206 next;

    ListNode206() {
    }

    ListNode206(int val) {
        this.val = val;
    }

    ListNode206(int val, ListNode206 next) {
        this.val = val;
        this.next = next;
    }
}

