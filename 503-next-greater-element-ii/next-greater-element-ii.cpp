#include <vector>
#include <stack>

class Solution {
public:
    std::vector<int> nextGreaterElements(std::vector<int>& nums) {
        int n = nums.size();
        std::vector<int> result(n, -1);
        std::stack<int> s; // store indices
        for (int i = 0; i < 2 * n; ++i) {
            int current = nums[i % n];
            while (!s.empty() && nums[s.top()] < current) {
                result[s.top()] = current;
                s.pop();
            }
            if (i < n) {
                s.push(i);
            }
        }
        return result;
    }
};