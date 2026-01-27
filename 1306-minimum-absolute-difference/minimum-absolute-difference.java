class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        int mindiff = Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            mindiff = Math.min(mindiff, (arr[i+1]-arr[i]));
        }
        for(int i=0; i<n-1; i++){
            if(arr[i+1]-arr[i]==mindiff){
                List<Integer> elemnt = new ArrayList<>();
                elemnt.add(arr[i]);
                elemnt.add(arr[i+1]);
                ans.add(elemnt);
            }
        }
        return ans;
    }
}