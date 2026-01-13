class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int index = 0;
        for(int x: nums){
            arr[index++] = x;
        }
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            int temp = arr[0];
            for(int j=1; j<n; j++){
               arr[j-1]=arr[j]; 
            }
            arr[n-1] = temp;
            int count = 0;
            for(int k=0; k<n; k++){
                if(arr[k]==nums[k]){
                    count++;
                }
            }
            if (count == n){return true;}
        }
        return false;
    }
}