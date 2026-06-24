class Solution {
    public int minSwaps(String s) {
        int swap = 0;
        int balance = 0;

        for (int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '['){
                balance++;

            }else{
                balance--;
            }
            if(balance < 0){
                swap++;
                balance = 1;
            }
        }
        return swap;
    }
}