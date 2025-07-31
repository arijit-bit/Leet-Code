class Solution {
public:
    double findMedianSortedArrays(vector<int>& num1, vector<int>& num2) {
        int len1 = num1.size();
        int len2 = num2.size();
        std::vector<int>arr(len1+len2);
        int mindex = 0, i=0, j=0;
        while (i<len1 && j<len2){
            if(num1[i] < num2[j]){
                arr[mindex++] = num1[i++];
            }else{
                arr[mindex++] = num2[j++];
            }    
        }
        while(i<len1){
            arr[mindex++] = num1[i++];
        }
        while(j<len2){
            arr[mindex++] = num2[j++];
        }
        int total = len1+len2;
        // for(int i=0; i<total; i++){
        //     cout<<arr[i]<<" ";
        // }

        if(total % 2 == 0){
            int mid = total/2;
            // cout<<arr[mid];
            // cout<<mid;
            float data = (arr[mid]+arr[mid-1])/2.0;
            return data;
        }else{
            int mid = total/2;
            return arr[mid];
        }
        
    }
};