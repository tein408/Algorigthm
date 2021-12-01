package leetcode.medium;

public class LC82 {

    public ListNode82 deleteDuplicates(ListNode82 head) {
        if(head == null || head.next == null)
            return head;

        ListNode82 node = new ListNode82(0);
        node.next = head;
        //two pointer로 사용할 객체 생성
        ListNode82 left = node;
        ListNode82 right = node.next;

        while(right != null) {
            while(right.next != null) {
                if(right.val == right.next.val)
                    right = right.next;
                else
                    break;
            }
            if(left.next == right)
                left = left.next;
            else
                left.next = right.next;
            right = right.next;
        }
        return node.next;
    }

}


//Definition for singly-linked list.
class ListNode82 {
    int val;
    ListNode82 next;

    ListNode82() {
    }

    ListNode82(int val) {
        this.val = val;
    }

    ListNode82(int val, ListNode82 next) {
        this.val = val;
        this.next = next;
    }
}
