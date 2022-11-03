class Solution {
   static boolean answer;
    public void multi(int n){
        
        int sum = 0;
        while(n > 0){
            int tmp = n % 10; 
            n/=10;
            sum += (tmp* tmp);
        }
        
        if(sum == 1) {
            answer = true;
            return;
        } else if(sum <= 5) {
            answer = false;
            return;
        } else multi(sum);
    }
    public boolean isHappy(int n) {
        multi(n);

        return answer;
    }
}