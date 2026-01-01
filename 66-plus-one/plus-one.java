class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        
        for(int i = size-1; i>=0; i--){
        // System.out.println( i); 
            if(digits[i] < 9){
                digits[i] = digits[i]+1;
                return digits;

            }else{
                digits[i] = 0;
            }
        }
            int[] newdigit = new int[size+1];
            
            newdigit[0] = 1;
            return newdigit;
        
        // return digits;
        // for(int i=0; i<size; i++){
        //     digit = digit*10+digits[i];
        // }
        // digit = digit+1;
        // String str = Integer.toString((int)digit);
        // int len = str.length();
        // int[] newdigi = new int[len];
        // for(int i=len-1; i>=0; i--){
        //     long value = digit % 10;
        //     newdigi[i]=(int)value;
        //     digit = digit/10;
        // }
        // System.out.println(count);
        // System.out.println(len);
        // return newdigi;


        // return digits;
    }
}