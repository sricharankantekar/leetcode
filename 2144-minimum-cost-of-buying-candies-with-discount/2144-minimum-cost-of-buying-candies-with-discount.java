import java.util.*;

class Solution {
    public int minimumCost(int[] cost) {

        Arrays.sort(cost);

        int total = 0;
        int count = 0;

        for(int i = cost.length - 1; i >= 0; i--) {

            count++;

            if(count == 3) {
                count = 0;   // third candy free
            }
            else {
                total = total + cost[i];
            }
        }

        return total;
    }
}