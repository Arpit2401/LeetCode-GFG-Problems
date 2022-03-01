class Solution {
    public boolean isHappy(int n) {       
        while(n != 1){
            if(n == 7)
                return true;
            else if(n <= 9)
                return false;
            int num = 0;
            while(n > 0){
                num += Math.pow(n % 10, 2);
                n /= 10;
            }
            n=num;
        }
        return true;
    }
}