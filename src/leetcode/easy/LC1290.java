package leetcode.easy;

public class LC1290 {
    //BigInteger 이용 11ms 37.7mb
/*    public int getDecimalValue(leetcode.easy.ListNode1290 head) {
        String str = "";
        while(head != null) {
            str += head.val + "";
            head = head.next;
        }
        BigInteger a = new BigInteger(str, 2);
        int b = Integer.parseInt(a.toString());
        return b;
    }*/

    //StringBuilder 이용 0ms 36.7mb
/*    public int getDecimalValue(leetcode.easy.ListNode1290 head) {
        StringBuilder sb = new StringBuilder();
        while(head != null) {
            sb.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }*/

    //0ms 36.2mb
    public int getDecimalValue(ListNode1290 head) {
        int ans = 0;
        while(head != null) {
            ans = 2 * ans + head.val;
            head = head.next;
        }
        return ans;
    }

}

//Definition for singly-linked list.
class ListNode1290 {
    int val;
    ListNode1290 next;

    ListNode1290() {
    }

    ListNode1290(int val) {
        this.val = val;
    }

    ListNode1290(int val, ListNode1290 next) {
        this.val = val;
        this.next = next;
    }
}