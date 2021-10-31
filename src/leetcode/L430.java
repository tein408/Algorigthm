/*

// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node(Node prev) {
        this.prev = prev;
    }
}

class LC430 {
    public Node flatten(Node head) {
        //메서드 호출
        flatten(head);
        return head;
    }

    Node flatten(Node head) {
        //1. null이면 flatten 할 필요 X, return head
        if(head == null)
            return head;

        //2. child가 없는 경우
        if(head.child == null) {
            //2-1. next 도 없으면 flatten 필요 X, return head
            if(head.next == null)
                return head;
            //2-2. next가 있다면 flatten 해야하고,
            //     flatten할 head로 head의 next 전달
            return flatten(head.next);
        }

        //3. child가 있는 경우
        else {
            //3-1. child 담을 객체 생성
            Node child = head.child;
            //head의 child를 3-1.에서 child객체에 담았으니 null로 비움.
            head.child = null;

            //3-2. next 담을 객체 생성
            Node next = head.next;

            //3-3. head의 child를 담은 child 객체(3-1.)도 flatten 하기 위해
            //     flatten()을 호출하고, flatten할 head로 child를 전달하고,
            //     이를 childTail객체에 저장.
            Node childTail = flatten(child);

            //3-4. head의 next에 child를 담고,
            head.next = child;
            //3-5. child(3-1.)의 prev는 head가 됨.
            child.prev = head;

            //3-6. next(3-2.)가 비어 있지 않다면,
            //     즉, next가 leafnode가 아니라면
            //     child를 가지고 있을 수 있고, next도 가지고 있는 상태이므로
            //     child는 flatten 해야하고, 이를 next와 연결해야함.
            if(next != null) {
                //3-7. 그래서 3-3.에서 flatten한 childTail의 next에 3-2.의 next를 연결하고,
                childTail.next = next;
                //next(3-2.)의 prev는 childTail이 됨.
                next.prev = childTail;

                //flatten() 호출하면서 next를 flatten할 head로 전달.
                return flatten(next);
            }

            //3-8. next가 없다면(위쪽 if문 3-6.에서 false였다면),
            //     위쪽의 3-3.에서 child의 leafnode까지 flatten된 childTail 리턴
            return childTail;
        }
    }

}

*/
