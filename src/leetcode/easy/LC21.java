package leetcode.easy;

public class LC21 {

    public ListNode21 mergeTwoLists(ListNode21 l1, ListNode21 l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        ListNode21 root = new ListNode21();
        ListNode21 res = root;

        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                res.next = l2;
                l2 = l2.next;
            }
            else {
                res.next = l1;
                l1 = l1.next;
            }
            res = res.next;
        }

        if(l1 == null)
            res.next = l2;
        if(l2 == null)
            res.next = l1;

        return root.next;
    }

}


// Definition for singly-linked list.
class ListNode21 {
    int val;
    ListNode21 next;

    ListNode21() {
    }

    ListNode21(int val) {
        this.val = val;
    }

    ListNode21(int val, ListNode21 next) {
        this.val = val;
        this.next = next;
    }
}
