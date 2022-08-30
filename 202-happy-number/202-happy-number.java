class Solution {
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        } else if(n <= 5){
            return false;
        }
        int sum = 0;
        while(n > 0){
            sum += Math.pow(n % 10, 2);
            n = (int) n / 10;
        }
        return isHappy(sum);
    }
}