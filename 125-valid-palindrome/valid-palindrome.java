class Solution {
    public boolean isPalindrome(String s) {
        char[] str = s.toLowerCase().toCharArray();
        int n = str.length;
        if(n==1){return true;}
        int left = 0;
        int base = 0;
        for(int i=0; i<n; i++){
            if((str[i]>='a' && str[i]<='z')||(str[i]>='0' && str[i]<='9')){
                str[base++] = str[i];
            }
        }
        if(base==0){return true;}
        for(int i=0; i<base; i++){
            System.out.println(str[i]);
        }
        int right = base-1;
        // if(base == 1){return false;}
        while(left<=right){
            if(str[left] != str[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}