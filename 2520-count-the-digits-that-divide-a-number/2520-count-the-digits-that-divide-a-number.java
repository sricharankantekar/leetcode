class Solution {
    public int countDigits(int n) {

        int temp=n;
        int count=0;
        int dig;
        while(temp!=0){

            dig=temp%10;
            temp=temp/10;
            if(n%dig==0){
                 
                count++;
            }
        }
        return count;
        
    }
}