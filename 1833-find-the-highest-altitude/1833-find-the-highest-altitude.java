class Solution {
    public int largestAltitude(int[] gain) {
        int arr[]= new int[gain.length+1];
        arr[0]=0;
        int value=0;
        

        for(int i=1; i<=gain.length; i++){
            arr[i]=gain[i-1]+arr[i-1];
        } 

        for(int i=0; i<arr.length; i++){
            if(value<arr[i]){
                value=arr[i];
            }

        }
        return value;
    }
}