class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]= new int[nums.length];
        int h=0;

        for(int i= 0; i<n; i++){

            arr[h]=nums[i];
            arr[h+1]=nums[n+i];
            h=h+2;
        }
        return arr;
        
    }
}