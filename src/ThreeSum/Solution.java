package ThreeSum;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> listSet=new HashSet<>();
        Arrays.sort(nums);
        HashSet<Integer> restOfArray;
        for(int i=0;i<nums.length-2;i++){
            restOfArray=new HashSet<>();
            for (int j = i+1; j <nums.length-1 ; j++) {
                if(restOfArray.contains(-nums[i]-nums[j])){
                    ArrayList<Integer> tuple=new ArrayList<>();
                    tuple.add(nums[i]);
                    tuple.add(nums[j]);
                    tuple.add(-nums[i]-nums[j]);
                    listSet.add(tuple);
                }else {
                    restOfArray.add(nums[j]);
                }
            }
        }
        return new LinkedList<>(listSet);
    }
}