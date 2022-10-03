class Solution {
    public int solution(int num) {
        long n = num;
        int answer = 0;
        

        if(n == 1) return 0;
        else{
            while(true){
            if(answer == 501 && n != 1){
                answer = -1;
                break;
            }
            else{
                if(answer <= 500 && n == 1) break;
            }
            if(n % 2 == 0){
                n = n / 2;
                answer++;
            }
            else{
                n = (n * 3) + 1;
                answer++;
            }
        }
        }
        
        return answer;
    }
}