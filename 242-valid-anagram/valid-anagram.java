class Solution {
    public boolean isAnagram(String s, String t) {
        char a [] = s.toCharArray();
        char b [] = t.toCharArray();
        Arrays.sort(a);
        System.out.println(a.toString());
        Arrays.sort(b);
        System.out.println(b.toString());
        
        return Arrays.equals(a,b);
    }
}