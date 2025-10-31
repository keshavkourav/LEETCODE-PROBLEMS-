class Solution {
    public boolean isPalindrome(int x) {
        boolean a= false;
        
        String str= String.valueOf(x);
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals (reversed)){
            a= true;  
        }
        return a;


    }
}