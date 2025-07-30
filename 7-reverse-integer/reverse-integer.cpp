class Solution {
public:
    int reverse(int x) {
        long long int rev = 0;
        while(x != 0){
            int dig = x%10;
            rev = rev*10 + dig;
            x /= 10;

            if (rev > INT32_MAX || rev < INT32_MIN) {
                return 0;
            }
        }
        return static_cast<int>(rev);
    }

};