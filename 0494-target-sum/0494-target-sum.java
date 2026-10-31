class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        return solve(0, nums,target,sum);
        
        
    }

    public int solve(int i, int[] nums,int target,int sum){
        if(i == nums.length){
            if(target == sum){
                return 1;
            }else{
                return 0;
            }

        }
        int add = solve(i+1,nums,target,sum + nums[i]);
        int sub = solve(i+1,nums,target,sum - nums[i]);
        return add + sub;
    }
}