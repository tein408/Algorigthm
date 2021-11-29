package leetcode.easy;

public class LC83 {

    public ListNode83 deleteDuplicates(ListNode83 head) {
        if(head == null)
            return head;

        ListNode83 node = head;
        while(node != null) {
            if(node.next != null && node.val == node.next.val)
                node.next = node.next.next;
            else
                node = node.next;
        }
        return head;
    }

}


//Definition for singly-linked list.
class ListNode83 {
    int val;
    ListNode83 next;

    ListNode83() {
    }

    ListNode83(int val) {
        this.val = val;
    }

    ListNode83(int val, ListNode83 next) {
        this.val = val;
        this.next = next;
    }
}

