class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int totalgas = 0;
        int currentgas = 0;
        int start = 0;
        for(int i = 0;i<gas.length;i++){
            int diff = gas[i] - cost[i];
            totalgas = totalgas + diff;
            currentgas = currentgas + diff;
            if(currentgas<0){
                start = i +1;
                currentgas = 0;
            } 
        }
        if(totalgas <0){
            return -1;
        }
        return start;
    }
}