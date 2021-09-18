import java.util.ArrayList;

public class PGFindPrime {

    int answer;
    boolean []check = new boolean[10];
    ArrayList<Integer> arr = new ArrayList<>();
    
    //탐색
    void dfs(String str, String tmp, int m){
        //solution() for문 내에서 호출
        //1.문자열 길이가 i+1과 같다면
        if(tmp.length() == m){
            int num = Integer.parseInt(tmp);
            //1-1.그 문자가 arr에 없으면 arr에 추가
            if(!arr.contains(num))
                arr.add(num);
            return;
        }
        //2.문자열 길이가 i+1이 아니라면 소수인지 검사
        else{
            for(int i=0; i<str.length(); i++){
                //방문하지 않은 인덱스일 경우만 탐색
                if(!check[i]){
                    check[i] = true;    //방문 처리
                    tmp += str.charAt(i);   //임시로 tmp에 하나씩 붙여서 탐색
                    dfs(str, tmp, m);
                    check[i] = false;   //조합 완료 후 다시 미방문 처리
                    tmp = tmp.substring(0, tmp.length()-1); //tmp에서 마지막 자리 숫자 제외하고 갱신
                }
            }
        }
    }
    
    //소수인지 판별
    void is_prime(int n){
        if(n==0) return;
        if(n==1) return;
        for(int i=2;i< n ;i++){
            if(n % i == 0) return;
        }
        answer++;
    }
    
    public int solution(String numbers) {
        String tmp ="";
        for(int i=0;i<numbers.length();i++){
            dfs(numbers, tmp, i+1);
        }
        for(int i=0;i<arr.size();i++){
            is_prime(arr.get(i));
        }
        return answer;
    }



}
