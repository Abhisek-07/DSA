class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
//         If car starts at A and can not reach B. Any station between A and B
//          can not reach B.(B is the first station that A can not reach.) OR If A cannot reach B, then any station that can be reached from A, cannot reach B.
// If the total number of gas is bigger than the total number of cost. There must be a solution.
        
        int total = 0;
        for(int i=0; i < gas.length; i++) {
            total = total + gas[i] - cost[i];
        }
        if(total < 0)                       // to determin if solution exists
            return -1;
        

        
        int fuel = 0;
        int start = 0;
        
        for(int i=0; i < gas.length; i++) {
            fuel += gas[i] - cost[i];
            
            if(fuel < 0) {
                fuel = 0;
                start = i + 1;
            }
        }
        return start;
    }
}
