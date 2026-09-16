class Solution {
    public int climbStairs(int n) {
        
        //base case
        int prev1 = 1;
        int prev2 = 1;
        int curr = prev1 + prev2;

        if(n==1) return prev1;

        //same recurrence logic no array
        for(int i=2; i<=n; i++){
            curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;

        }
        return curr;
    }
}