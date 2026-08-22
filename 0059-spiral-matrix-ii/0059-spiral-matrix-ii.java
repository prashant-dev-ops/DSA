class Solution {
    public int[][] generateMatrix(int n) {
        List<Integer> result = new ArrayList<>();
        int[][] arry = new int[n][n];
        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = n-1;
        int num = 1;
        while(num<=n*n){
        for(int i= left ; i<=right;i++){
            arry[top][i] = num++; 
        }
        top++;
        for(int i = top;i<=bottom;i++){
            arry[i][right] = num++;
        }
        right--;
        for(int i = right;i>=left;i--){
            arry[bottom][i] = num++;
        }
        bottom--;
        for(int i= bottom;i>=top;i--){
            arry[i][left] = num++;
        }
        left++;
        }
        return arry;
    
}
}