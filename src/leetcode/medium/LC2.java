package leetcode.medium;

public class LC2 {

    public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {
        ListNode2 ans = new ListNode2(0);
        ListNode2 head = ans;

        int sum = 0;
        int carry = 0;

        while(l1 != null || l2 != null || sum > 0) {

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if(sum >= 10) {
                carry = 1;
                sum -= 10;
            }

            head.next = new ListNode2(sum);
            head = head.next;

            sum = carry;
            carry = 0;

        }

        return ans.next;
    }

}


//Definition for singly-linked list.
class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2() {
    }

    ListNode2(int val) {
        this.val = val;
    }

    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}

