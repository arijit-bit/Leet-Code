class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector <string> result;
        backtrack (result, "", 0, 0, n, 0);
        return result;
    }

        void backtrack (vector<string>& result, string current, int open, int close, int n, int depth){
            if (current.size() == 2*n ){
                result.push_back(current);
                return;
            }
            if (open<n){
                backtrack(result, current+"(", open+1, close, n, depth+1);
            }
            if (open>close){
               backtrack(result, current+")", open, close+1, n, depth+1); 
            }
        }
};