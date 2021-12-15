package leetcode.medium;

public class LC147 {

    public ListNode147 insertionSortList(ListNode147 head) {
        if(head == null || head.next == null) {
            return head;
        }

        //정렬된 ListNode를 담을 객체 생성
        ListNode147 answer = new ListNode147(0);
        answer.next = head;

        //head의 다음 노드가 null 이 아닐동안 반복
        while(head.next != null) {

            //head.val > head.next.val 만족한다면
            if(head.val > head.next.val) {
                ListNode147 nextNode = answer;
                //추가할 위치 찾기
                //head.next 보다 작을동안만 반복하여
                //head의 제일 앞 위치를 찾음
                while(nextNode.next != null && nextNode.next.val < head.next.val) {
                    nextNode = nextNode.next;
                }
                
                //temp에 다음 탐색할 노드 저장해두고
                ListNode147 temp = head.next;
                //head.next에 그 다음 노드 저장
                head.next = head.next.next;
                //탐색할 노드의 다음 위치는 위에서 찾아둔 head의 제일 앞 위치 저장
                temp.next = nextNode.next;
                //head의 제일 앞 위치에 다음 탐색할 노드 저장
                nextNode.next = temp;
                
            }
            //head.val <= head.next.val 인 경우
            else {
                head = head.next;
            }
        }

        return answer.next;
    }

}


//Definition for singly-linked list.
class ListNode147 {
    int val;
    ListNode147 next;

    ListNode147() {
    }

    ListNode147(int val) {
        this.val = val;
    }

    ListNode147(int val, ListNode147 next) {
        this.val = val;
        this.next = next;
    }
}

