package leetcode.easy;

public class LC167 {

/*    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int sum = 0;
        int[] res = new int[2];

        while(left < right) {
            res[0] = left + 1;
            res[1] = right + 1;
            sum = numbers[res[0]-1] + numbers[res[1]-1];

            if(sum == target)
                break;
            else if(sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return res;
    }*/

    // 더 빠른 코드
   public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left < right) {
            int temp = numbers[left] + numbers[right];
            if(temp == target)
                return new int[]{left+1, right+1};
            else if(temp > target) {
                right--;
            } else {
                left++;
            }

        }
        return new int[]{left+1, right+1};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] re = twoSum(arr, 9);
        for(int i : re) {
            System.out.println(i);
        }
    }

}