class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int k=x;
        int reverse=0;
        while(x !=0){
            int m=x%10;
            reverse=reverse*10+m;
            x=x/10;
        }
        return reverse==k;
        
        
    }
}