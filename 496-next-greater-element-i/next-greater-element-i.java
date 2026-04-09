class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []ans = new int [nums1.length];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=nums1.length-1; i>=0; i--){
        //     int index = 0;
        //     for(index=0; index<nums2.length; index++){
        //         if(nums1[i]==nums2[index]){
        //             break;
        //         }
        //     }
        //     System.out.println(index);
        for(int i=nums2.length-1; i>=0; i--){
            int curr = nums2[i];
            while(!st.isEmpty() && st.peek()<curr){ // this stack will always put maintain order, larger elements sre in bottom.
                //(maintains order) exmp - [1,2,3,4] largest in bottom
                st.pop(); //current element larager than top so it should be in bottom , place in right place pop the top elemet
            }
            if(!st.isEmpty()){
                map.put(curr, st.peek()); //next garter of current element as all smallers are popped
            }
            if(st.isEmpty()){
                map.put(curr, -1);
            }
            st.push(curr);
        }
        int ix = 0;
        for(int x: nums1){
            ans[ix++] = (int)map.get(x);
        }
        return ans;
    }
}