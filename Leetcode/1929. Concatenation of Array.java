class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length; //{1,2,1} //n=3 
        int[] ans = new int[2*n];//2n=6

        for(int i=0 ; i < n ; i++){ ///0<3
            ans[i]=nums[i];//0->0
            ans[i+n]=nums[i];//3->0
        }

        return ans;

    }
}

//// https://leetcode.com/problems/concatenation-of-array/