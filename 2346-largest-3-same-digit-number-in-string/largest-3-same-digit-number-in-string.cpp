class Solution {
public:
    string largestGoodInteger(string num) {
        stack<char> st;
        string ans = "";
        string maxans = ""; // store as string, not int
        
        for (auto c : num) {
            if (st.empty()) {
                st.push(c);
                ans = string(1, c);
            } 
            else {
                if (c != st.top()) {
                    if (ans.size() != 3) {
                        while (!st.empty()) st.pop();
                        ans = "";
                    } else {
                        maxans = max(maxans, ans); // compare as strings
                        while (!st.empty()) st.pop();
                        ans = "";
                    }
                    st.push(c);
                    ans = string(1, c);
                } 
                else {
                    st.push(c);
                    ans += c;
                    if (ans.size() == 3) {
                        maxans = max(maxans, ans); // update max
                    }
                }
            }
        }
        
        return maxans; // already correct with leading zeros
    }
};
