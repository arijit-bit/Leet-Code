class Solution {
    public String longestCommonPrefix(String[] strs) {
        System.out.println(strs[0]);
        String prefix = strs[0];
        
        // System.out.println(prefix[0]);
        // System.out.println(prefix.charAt(0));
        for (int i=1; i<strs.length; i++){
            String current = strs[i];
            StringBuilder ans = new StringBuilder();
            for(int j = 0; j<prefix.length() && j<current.length(); j++ ){
                if (current.charAt(j) == prefix.charAt(j)){
                    ans.append(current.charAt(j));
                    // System.out.println(ans);
                }
                else{
                    break;
                }
            }
            prefix = ans.toString();
        }

    return prefix;
    }
}