package leetcode.medium;

//Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LC19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //n번째 노드를 제거한 ListNode를 담을 객체
        ListNode node = new ListNode(0);
        node.next = head;

        //이동할 노드들
        ListNode left = node;
        ListNode right = node;

        //right를 n번째까지 이동하여 left와 right사이에 n만큼의 차이를 만들고
        while(n-->0) {
            right = right.next;
        }

        //right.next가 null이 아닐때까지 한칸씩 이동시켜서
        //left를 n보다 한칸 앞에 위치 시킴.
        while(right.next != null) {
            left = left.next;
            right = right.next;
        }

        //left는 null이고, left.next가 삭제할 노드
        //left.next를 left의 다음다음 노드로 저장
        left.next = left.next.next;
        return node.next;
    }
}