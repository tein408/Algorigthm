package leetcode.easy;

public class LC203 {

    public ListNode203 removeElements(ListNode203 head, int val) {
        ListNode203 ans = new ListNode203(0);
        ans.next = head;
        ListNode203 curr = ans;

        while(curr.next != null) {
            if(curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return ans.next;
    }

}

//Definition for singly-linked list.
class ListNode203 {
     int val;
    ListNode203 next;
    ListNode203() {}
    ListNode203(int val) { this.val = val; }
    ListNode203(int val, ListNode203 next) { this.val = val; this.next = next; }
}
