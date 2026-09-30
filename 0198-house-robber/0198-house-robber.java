class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = nums[0];
        if(n>1) arr[1] = Math.max(nums[1],nums[0]);
        for(int i = 2;i<n;i++){
            arr[i] = Math.max((arr[i-2]  + nums[i]),arr[i-1]);
        }

        return arr[n-1];
        
    }
}