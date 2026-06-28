class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        System.out.println(n);
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int left = intervals[0][0];
        int right = intervals[0][1];
        ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
        for (int curr=1; curr<n; curr++){
            int cleft = intervals[curr][0];
            int cright = intervals[curr][1];
            if(right >= cleft){
                right = Math.max(right, cright);
            }else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(left);
                temp.add(right);
                ans.add(temp);

                left = cleft;
                right = cright;
                
            }
            
        }
        ArrayList<Integer> temp = new ArrayList<>();
            temp.add(left);
            temp.add(right);
            ans.add(temp);
        // System.out.println(intervals[1][1]);
        return convertTo2DArray(ans);
    }
    protected int[][] convertTo2DArray(ArrayList<ArrayList<Integer>> matrixList) {
        // 1. Allocate the outer array row size
        int[][] arr = new int[matrixList.size()][];

        // 2. Loop through each row
        for (int i = 0; i < matrixList.size(); i++) {
            ArrayList<Integer> rowList = matrixList.get(i);
            
            // 3. Allocate the column size for this specific row
            arr[i] = new int[rowList.size()];
            
            // 4. Copy each wrapper Integer to primitive int
            for (int j = 0; j < rowList.size(); j++) {
                arr[i][j] = rowList.get(j); // Auto-unboxing happens here
            }
        }
        return arr;
    }
}