class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[2*nums.length];
        int k=0;
        for(int i=0; i<nums.length; i++){
            ans[i]=nums[i];
        }
        for(int i=nums.length; i<2*nums.length; i++){
            ans[i]=nums[k];
            k++;
        }

        return ans;
        
    }
}