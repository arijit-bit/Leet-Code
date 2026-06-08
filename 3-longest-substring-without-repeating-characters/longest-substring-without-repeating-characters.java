class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int count = 0;
        ArrayList<Character> temp = new ArrayList<>();
        for(int i=0; i<s.toCharArray().length; i++){
            while(temp.contains(s.charAt(i))){
                temp.remove(0);
            }
            temp.add(s.charAt(i));
            ans = Math.max(ans, temp.size());
        }
        return ans;
    }
}