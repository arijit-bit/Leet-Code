class Solution {
    public boolean isSubsequence(String s, String t) {
        Stack <Character> st = new Stack<>();
        if(s.length() == 0) return true;
        for(int i=s.length()-1; i>=0; i--){
            st.push(s.charAt(i));
        }
        for(int i = 0; i<t.length(); i++){
            char curr = t.charAt(i);
            if(!st.isEmpty() && st.peek() == curr){
                st.pop();
            }
        }
    return st.isEmpty();

    }
}