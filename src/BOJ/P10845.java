package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(bf.readLine());

        CircularQueue que = new CircularQueue(num);

        for(int i=0; i<num; i++){

            String str = bf.readLine();

            switch (str.charAt(0)){
                case 's':
                    sb.append(que.size()).append("\n");
                    break;
                case 'e':
                    sb.append(que.isEmpty()? 1:0).append("\n");
                    break;
                case 'f':
                    sb.append(que.front()).append("\n");
                    break;
                case 'b':
                    sb.append(que.back()).append("\n");
                    break;
                case 'p':
                    if(str.charAt(1) == 'u') que.push(Integer.parseInt(str.split(" ")[1]));
                    else sb.append(que.pop()).append("\n");
                    break;
            }

        }

        System.out.println(sb);


    }
}

class CircularQueue{
    private int front;
    private int rear;
    private int queueSize;
    private int itemArray[];

    public CircularQueue(int queueSize){
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

    public int size(){
        if(isEmpty()){
            return 0;
        } else {
            return Math.abs(rear-front);
        }
    }

}//CircularQueue class