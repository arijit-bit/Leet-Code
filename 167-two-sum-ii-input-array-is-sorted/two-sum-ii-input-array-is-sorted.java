class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if(left > 0 && numbers[left] == numbers[left-1]) left++;
            if(right > n-1 && numbers[right] == numbers[right-1]) right--;
            int sum  = numbers[left] + numbers[right];
            if(sum == target){
                return new int [] {left+1, right+1};
            }
            if(sum > target)right-- ;
            else left++ ;
        }
        return new int[]{0,0};
    }
}