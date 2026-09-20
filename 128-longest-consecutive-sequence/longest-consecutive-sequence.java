class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int count = 1;
        int ans = 0;
        for(int cur:set){
            int temp = cur;
            while(!set.contains(cur-1)){
                if(set.contains(temp+1)){
                    count++;
                    temp++;
                }else{
                    break;
                }
            }
            ans = Math.max(ans, count);
            count = 1;


        }
        return ans;
    }
}