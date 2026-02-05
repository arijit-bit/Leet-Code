class Solution {
    public int addDigits(int num) {
        
        
        while(num>=10){
            num = helper(num);
        }
        return num;
    }
    protected int helper(int num){
        if(num/10 == 0){
            return num;
        }
        // int n = num%10;
        return num%10 + helper(num/10);
    }
}