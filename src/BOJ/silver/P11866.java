package BOJ.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P11866 {
    //c++로 풀었음

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        CircularQueue3 test = new CircularQueue3(n);

        Queue<Integer> que = new LinkedList<>();

        for(int i=0; i<n; i++){
            que.add(i+1);
        }

        for(int i=0; i<n; i++) que.add(i+1);

        while(que.size()>0){
            int temp = que.peek();
            if(temp == k) {
                System.out.println("test : "+temp);
                System.out.printf("%d\n",que.poll());
            } else {
                System.out.println("test2 : "+temp);
                que.add(temp);
                que.remove();
            }

        }


        /*int cnt = 0;
        que.push(que.pop());
        System.out.println("test : "+que.back());*/

        /*while(que.isEmpty()){
            que.push(que.pop());
            cnt++;
            if(cnt == k){
                System.out.println(que.pop());
                cnt=0;
            }
        }*/
    }

}
class CircularQueue3{
    private int front;
    private int rear;
    private int queueSize;
    private int itemArray[];

    CircularQueue3(int queueSize){
        front = 0;
        rear = 0;
        this.queueSize = queueSize+1;
        itemArray = new int[this.queueSize];
    }

    public boolean isEmpty() {
        if(front == rear) return true;
        else return false;
    }

    public void push(int item){
        itemArray[rear] = item;
        rear = (rear+1)%(queueSize);
    }

    public int front() {
        if(isEmpty()){
            return -1;
        } else {
            front = (front)%queueSize;
            return itemArray[front];
        }
    }

    public int back() {
        if(isEmpty()){
            return -1;
        } else {
            //rear = (rear)%queueSize;
            return itemArray[rear-1];
        }
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        } else {
            int temp = itemArray[front];
            front = (front+1)%queueSize;
            return temp;
        }
    }

}//CircularQueue class