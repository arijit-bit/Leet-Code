class Solution {
    public int lengthOfLongestSubstring(String s) {
        int op = 0;
        ArrayList<Character> ans = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            while(ans.contains(s.charAt(i))){
                ans.remove(0);
            }
            ans.add(s.charAt(i));
            op = Math.max(op, ans.size());
        }
        return op;
    }
}