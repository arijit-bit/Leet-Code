class Solution {
    public int strStr(String haystack, String needle) {

        int m = haystack.length();
        int n = needle.length();
        int secondIndex = 0;
        int firstIndex = 0;
        int lenCount  = 0;
        for(int i=0; i<m-n+1; i++){
            firstIndex = i;
            while(haystack.charAt(firstIndex) == needle.charAt(secondIndex)){
                if(lenCount == n-1){
                    return i;
                }
                lenCount++;
                firstIndex++;
                secondIndex++;
            }
            secondIndex = 0;
            lenCount = 0;   
        }
        return -1;
    }
}