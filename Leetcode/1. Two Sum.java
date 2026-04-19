class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> seenItem = new HashMap<>();
        
        for(int i=0; i<nums.length;i++){
            if(seenItem.containsKey(target-nums[i])){
                int j = seenItem.get(target-nums[i]);
                return new int[]{j,i};
            }
            else{
                seenItem.put(nums[i],i);
            }
        }
        return null;
    }
}


////https://leetcode.com/problems/two-sum/