class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int temp = 1;
        int i = 0;
        int n = citations.length;
        for(i = n; i > 0; i--){
            if(citations[n-i] >= i){
                return i;
            }

        }
        return 0;
    }
}