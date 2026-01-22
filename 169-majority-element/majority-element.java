class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x, 1);
            }
        }
        for(int x:nums){
            max = Math.max(max, map.get(x));
        }
        for(int x:nums){
            if(max == map.get(x)){
                return x;
            }
        }

    return 0;
    }
}