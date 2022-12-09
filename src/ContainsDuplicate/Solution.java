package ContainsDuplicate;
import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integers= new HashSet<>(nums.length);
        int current;
        for(int i=0;i<nums.length;i++){
            current=nums[i];
            if (integers.contains(current)){
                return true;
            }
            integers.add(current);
        }
        return false;
    }
}