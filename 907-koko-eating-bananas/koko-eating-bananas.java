class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int largest = 0;
        for(int i=0; i<n; i++){
            largest = Math.max(largest, piles[i]);
        }
        int left = 1;
        int right = largest;
        int prev = largest;
        int mid = largest;
        while(left<=right){
            mid = left + (right-left)/2;
            int ans = possible(piles, h, mid);
            if (ans != -1){
                prev = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }


        }
        return prev;
    }
    protected int possible(int[] piles, int h, int mid){
        long count = 0;
        for(int i=0; i<piles.length; i++){
            double curr = (double) piles[i]/mid;
            // System.out.println(curr);
            count += (long)Math.ceil(curr);
        }
        if(count>h){
            return -1;
        }
        return 1;
    }
}