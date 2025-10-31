class Solution {
    public long findTheArrayConcVal(int[] nums) {

        long answer=0;

        if(nums.length%2 != 0){
            answer= answer + nums[nums.length/2];
        }

        String[] strArr = new String[nums.length];

            for (int i = 0; i < nums.length; i++) {
            strArr[i] = String.valueOf(nums[i]);
            }

            String summ[]=new String[nums.length/2];

        for(int i=0; i<(nums.length/2); i++){

            int j=nums.length-1-i;

                summ[i]= strArr[i]+strArr[j];
            

        }

        int[] arr = new int[summ.length];
            for (int i = 0; i < summ.length; i++) {
            arr[i] = (int) Long.parseLong(summ[i]);

        }


        for (int i=0; i<arr.length; i++){
            answer= arr[i]+answer;
        }

        return answer;


        
    }
}