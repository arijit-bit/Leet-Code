class Solution {
    public long sumAndMultiply(int n) {
        long number = 0;
        int curr = 0;
        int sum = 0;
        int count = 1;
        while(n != 0){
            curr = n%10;

            if(curr != 0){
                number = (curr*count)+number;
                sum += curr;
                count *= 10;
            }
            n = n/10;
        }
        return number*sum;
    }
}