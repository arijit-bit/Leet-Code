class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // want no duplicate value;
        for(int num: nums){
            set.add(num);
        }

        int ans = 0;

        for(int num : set){
            // no previous sequence. it could be a start of a consecutive elements sequence.
            if(!set.contains(num-1)){
                int curr = num;
                int count = 1;
                
                //Checking next consecutive element is avilable or not
                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
                ans = Math.max(count, ans);
            }
        }
        return ans;
    }
}