package sort;

public class Eratosthenes {
    static int num = 10001;
    static int[] arr = new int[num];

    static void isPrime(){
        // 1. 배열을 생성하여 초기화한다.
        for(int i=2; i<num; i++) arr[i] = i;

        // 2. 2부터 시작해서 특정 수의 배수에 해당하는 수를 모두 지운다.
        for(int i=2; i<num; i++){
            // (지울 때 자기자신은 지우지 않고, 이미 지워진 수는 건너뛴다.)
            if(arr[i] == 0) continue;

            // 이미 지워진 숫자가 아니라면, 그 배수부터 출발하여, 가능한 모든 숫자 지우기
            for(int j=2*i; j<num; j+=i) arr[j] = 0;
        }

        // 3. 2부터 시작하여 남아있는 수를 모두 출력한다.
        for(int i=2; i<num; i++) {
            if(arr[i]!=0) System.out.println(arr[i]);
        }

    }


    public static void main(String[] args) {

        isPrime();


    }
}
