class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // Correct array initialization
                    return new int[] {i, j};
                }
            }
        }
        // Return an empty array if no solution is found
        return new int[] {}; 
    }
}