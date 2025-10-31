class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int answer[]=new int[n];
        for (int i=0; i<n; i++){
            int opr=0;
            for (int j=0; j<n; j++){
            if (boxes.charAt(j) == '1'){
                opr=opr+ Math.abs(i-j);

                // answer[i]+=j;
            }
            }
            answer[i]=opr;
            
        }
        return answer;
        
    }
}