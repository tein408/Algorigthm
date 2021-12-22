package leetcode.medium;

public class LC143 {

    public void reorderList(ListNode143 head) {
        if(head == null || head.next == null)
            return;

        ListNode143 slow = head;
        ListNode143 fast = head;

        //leetcode.medium.ListNode143 중간 찾기
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse
        ListNode143 prevMid = slow;
        ListNode143 prevCurr = slow.next;
        while(prevCurr.next != null) {
            ListNode143 curr = prevCurr.next;
            prevCurr.next = curr.next;
            curr.next = prevMid.next;
            prevMid.next = curr;
        }

        slow = head;
        fast = prevMid.next;
        while(slow != prevMid) {
            prevMid.next = fast.next;
            fast.next = slow.next;
            slow.next = fast;
            slow = fast.next;
            fast = prevMid.next;
        }

    }


    /*
     public void reorderList(leetcode.medium.ListNode143 head) {
        if(head == null || head.next == null) return;

        leetcode.medium.ListNode143 slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        leetcode.medium.ListNode143 right = reverse(slow);
        merge(head, right);
    }

    public leetcode.medium.ListNode143 reverse(leetcode.medium.ListNode143 head) {
        if(head == null || head.next == null) return head;

        leetcode.medium.ListNode143 previous = null, current = head, next = null;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public void merge(leetcode.medium.ListNode143 head1, leetcode.medium.ListNode143 head2) {
        if(head1 == null || head2 == null) return;

        leetcode.medium.ListNode143 pointer1 = head1, pointer2 = head2;
        while(pointer1 != null && pointer2 != null) {
            leetcode.medium.ListNode143 temp = pointer1.next;
            pointer1.next = pointer2;
            pointer2 = pointer2.next;
            if(temp.next != null) {
                pointer1.next.next = temp;
                pointer1 = temp;
            }
            else pointer1 = null;
        }
    }
     */

}


//Definition for singly-linked list.
class ListNode143 {
    int val;
    ListNode143 next;

    ListNode143() {
    }

    ListNode143(int val) {
        this.val = val;
    }

    ListNode143(int val, ListNode143 next) {
        this.val = val;
        this.next = next;
    }
}
