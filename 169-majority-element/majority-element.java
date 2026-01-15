class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxValue = Integer.MIN_VALUE;
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }
        for(int x:nums){
            maxValue = Math.max(maxValue, map.get(x));
        }
        int ans = 0;
        for(int x:nums){
            if(map.get(x)==maxValue){
            ans = x;
            }
        }
        
        return ans;
        

    }
}