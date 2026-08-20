class Solution {
    public int climbStairs(int n) {

        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        int first = 1;
        int sec = 2;

        for(int i = 3;i<=n;i++){
            int third = sec + first;
           first = sec;
           sec = third;
        }

        return sec;
        
    }
}