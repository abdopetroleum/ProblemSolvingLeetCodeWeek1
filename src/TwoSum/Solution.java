package TwoSum;
import java.util.HashMap;
import java.util.Map;

class Solution {
    int target;
    int calcComplement(int number){
        return target-number;
    }
    public int[] twoSum(int[] nums, int target) {
        this.target=target;
        Map<Integer,Integer> integerIntegerMap=new HashMap<>();
        int result[]=new int[2];
        int current;
        int complemtNumber;
        for(int i=0;i<nums.length;i++) {
            current = nums[i];
            complemtNumber=calcComplement(current);
            if(integerIntegerMap.containsKey(complemtNumber)){
                result[0]=i;;
                result[1]=integerIntegerMap.get(complemtNumber);;
                return result;
            }
            integerIntegerMap.put(current,i);
        }
        return null;
    }
}