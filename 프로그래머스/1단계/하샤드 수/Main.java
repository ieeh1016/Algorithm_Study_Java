class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int number = x;
        //String str = String.valueOf(x);
        int sum = 0;
        while(x > 0){
            sum = sum + x % 10;
            x = x / 10;
        }
        if(number % sum == 0){
            answer = true;
        }
        
        return answer;
    }
}