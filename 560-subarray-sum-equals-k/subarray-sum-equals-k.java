class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix = 0;
        int result = 0;
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            prefix += nums[i];
            if(map.containsKey(prefix-k)){
                result += map.get(prefix-k);  //storing result which already have
            }
            map.put(prefix, map.getOrDefault(prefix, 0)+1); //getting 
        }
        return result;

    }
}