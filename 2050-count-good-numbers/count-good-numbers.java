class Solution {
    public int countGoodNumbers(long n) {
        // for even index - choices- 0,2,4,6,8 [5]
        // for odd index - choices - 2,3,5,7 [4]
        // n=5   [e, o, e, o, e]; --> odd count = n/2 ,, even count -> n-(odd count) == n-n/2
        // total combination for even is 5^(n-n/2)
        // total combination for odd is 4^n/2

        // int count = (int) ((Math.pow(5,(n-(n/2)))*Math.pow(4,(n/2)))%(Math.pow(10,9)+1));
        // System.out.println((Math.pow(5,(n-(n/2)))*Math.pow(4,(n/2)))%(Math.pow(10,9)+1));

        // int ans = 1;

        long mod = 1000000007;
        long totaleven = n - (n / 2);
        long totalodd = n / 2;
        long evencombo = cal(5, totaleven, mod);
        long oddcombo = cal(4, totalodd, mod);
        int count = (int) ((evencombo * oddcombo) % mod);

        return count;
    }

    private long cal(long base, long expo, long mod) {
        long ans = 1;
        base %= mod;
        while (expo > 0) {
            if (expo % 2 != 0) {
                ans = ( ans * base ) % mod;
                expo = expo - 1;
            } else {
                expo = expo / 2;
                base = (base * base) % mod;
            }
        }
        return ans;
    }
}