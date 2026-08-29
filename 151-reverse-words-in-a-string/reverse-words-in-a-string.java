class Solution {
    public String reverseWords(String s) {
        String []str = s.trim().split("\\s+");
        int left = 0;
        int right = str.length-1;
        // while(left < right){
        //     String temp = str[left].trim();
        //     str[left] = str[right].trim();
        //     str[right] = temp;
        //     left++;
        //     right--;
        // }
        s = "";
        for(int i=str.length-1; i>=0; i--){
            s = s+str[i].trim()+" ";
        }
        return s.trim();
    }
}