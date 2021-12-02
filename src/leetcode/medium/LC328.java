package leetcode.medium;

public class LC328 {

    public ListNode328 oddEvenList(ListNode328 head) {
        if(head == null || head.next == null || head.next.next == null)
            return head;

        //node에 head.next저장해두고
        ListNode328 node = head.next;
        ListNode328 hol = head;
        ListNode328 jjak = head.next;

        //짝수와 짝수의 다음이 null을 만나기 전까지 반복
        while(jjak != null && jjak.next != null) {
            //홀수 다음을 짝수의 다음(==홀수)로 저장
            hol.next = jjak.next;
            //그리고 홀수에 홀수 저장
            hol = hol.next;
            //짝수 다음은 홀수의 다음(==짝수)
            jjak.next = hol.next;
            //짝수는 짝수의 다음으로
            jjak = jjak.next;
        }
        //연결
        hol.next = node;
        return head;
    }

}


//Definition for singly-linked list.
class ListNode328 {
    int val;
    ListNode328 next;

    ListNode328() {
    }

    ListNode328(int val) {
        this.val = val;
    }

    ListNode328(int val, ListNode328 next) {
        this.val = val;
        this.next = next;
    }
}

