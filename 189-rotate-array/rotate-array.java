class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(0, n-1, nums);
        reverse(0, k-1, nums);
        reverse(k, n-1, nums);


    }
    public void reverse(int left, int right, int[] arr){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    
}