class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int largest = 0;
        for(int num : piles){
            largest = Math.max(num, largest);
        }

        int low = 1;
        int high = largest;
        int ans = largest;

        while(low <= high){
            int mid = low + (high - low)/2; // mid = eating capacity per hour
            boolean result = check(piles, h, mid);
            if(result){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    protected boolean check(int[] piles, int h, int mid){
        int timetaken = 0;
        for(int num: piles){
            timetaken += Math.ceil((double)num/(double)mid);
        }
        // System.out.println(timetaken);
        if(timetaken > h){
            return false;
        }
        return true;
    }
}