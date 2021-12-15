package leetcode.easy;

public class LC941 {

    public boolean validMountainArray(int[] arr) {
        boolean isDown = false;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1])
                return false;
            //내려가는거 체크
            if(arr[i] > arr[i+1]) {
                isDown = true;
                //i==0 인데 내려가면 false
                if(i==0)
                    return false;
            }
            //내려갔는데 다시 올라가면 false
            if(isDown && arr[i] <= arr[i+1])
                return false;
        }
        return isDown;
    }

}
