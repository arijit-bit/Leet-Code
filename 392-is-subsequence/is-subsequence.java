class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0;
            if(s.length() == 0) return true;
            while(right< t.length() && left <  s.length()){
            char curr = s.charAt(left);
                if(curr == t.charAt(right)){
                    left = left+1;
                    System.out.println(left);
                }
                right++;
            }
        return left == s.length();
    }
}