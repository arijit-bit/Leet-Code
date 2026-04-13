class Solution {
    public int removeDuplicates(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            if(map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }else{
                map.put(x, 1);
            }
        }
        int count = 0;
        int k = 0;
        for(int i=0; i<map.size(); i++){
            if(map.get(nums[count])<2){
                nums[k++]=nums[count];
                count++;
            }else if(map.get(nums[count])==2){
                nums[k++] = nums[count];
                nums[k++] = nums[count];
                count += 2;
            }else{
                nums[k++] = nums[count];
                nums[k++] = nums[count];
                count += map.get(nums[count]);
            }

        }
        System.out.println(map.values());
        return k;
    }
}