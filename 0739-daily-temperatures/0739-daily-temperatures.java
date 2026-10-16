class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i<n;i++){
            while(!stack.empty() && temp[i] > temp[stack.peek()] ){
                int j = stack.pop();
                ans[j] = i - j;
            }
            stack.push(i);
        }
        return ans;
    
    }
    
}