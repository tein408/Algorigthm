package BOJ.silver;

public class P4673 {

    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];

        for(int i=1; i<10001; i++){
            int idx = func(i);
            if(idx<10001) arr[idx] = true;
        }

        for(int i=1; i<10001; i++){
            if(!arr[i]) System.out.printf("%d\n", i);
        }

    }

    static int func(int n){
        int res = n;
        while(true){
            if(n==0) break;
            res += n%10;
            n = n/10;
        }
        return res;
    }
}
