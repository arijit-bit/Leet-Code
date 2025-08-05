class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        a = set()
        left = 0
        lmax = 0
        for right in range (len(s)):
            while s[right] in a:
                a.remove(s[left])
                left += 1
            a.add(s[right])
            lmax = max(lmax, right-left+1)
        return lmax