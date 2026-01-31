class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char[] copy = Arrays.copyOf(letters, letters.length);

        Arrays.sort(letters);
        for(char i : letters){
            if(target < i){
                return i;
            }
        }
    return copy[0];
    }
}