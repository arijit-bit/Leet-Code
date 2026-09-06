class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum = 0;
        int max = 0;
        for(int num: weights){
            sum += num;
            max = Math.max(max, num);
        }
        int high = sum;
        int low = max;
        int ans = sum;

        while(low <= high){
            int mid = low + (high - low)/2;
            boolean res = possible(weights, days, mid);
            if(res){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    protected boolean possible(int[] weights, int days, int mid){
        int sum = 0;
        int count = 0;
        for(int i=0; i<weights.length; i++){
            if(weights[i] > mid) return false;
            sum += weights[i];


            if(sum == mid){
                count++;
                sum = 0;
            }
            if(sum > mid){
                count++;
                sum = weights[i];
            } 
        }
        if (sum != 0){
            count++;
            sum = 0;
        }
        if(count<= days){
            return true;
        }
        return false;
    }
}