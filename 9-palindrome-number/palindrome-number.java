class Solution {
    public boolean isPalindrome(int x) {
        int original = x ; 
        int reverse = 0 ;
        while(original > 0){
            int digit = original % 10 ;
            reverse = 10 * reverse + digit ;
            original /= 10;
        }
        if(x == reverse){
            return true;
        }
        else{
            return false;
        }
    }
}