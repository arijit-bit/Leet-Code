#include <stack>
#include <unordered_map>
#include <string>

class Solution {
public:
    bool isValid(const std::string& s) {
        std::stack<char> stack;
        std::unordered_map<char, char> brackets = {
            {')', '('},
            {'}', '{'},
            {']', '['}
        };

        for (char c : s) {
            if (brackets.count(c)) {
                // c is a closing bracket
                if (stack.empty() || stack.top() != brackets[c]) {
                    return false;
                }
                stack.pop();
            } else {
                // c is an opening bracket
                stack.push(c);
            }
        }
        return stack.empty();
    }
};