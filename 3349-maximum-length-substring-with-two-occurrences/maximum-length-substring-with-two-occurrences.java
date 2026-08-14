class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);

            map.put(curr, map.getOrDefault(curr, 0)+1);
            while(map.get(curr)>2){
                char leftchar = s.charAt(left);
                map.put(leftchar, map.getOrDefault(leftchar, 0)-1);
                left++;
                // ans = Math.max(ans, (i-left)+1);
            }
            ans = Math.max(ans, (i-left)+1);
        }
        return ans;
    }
}