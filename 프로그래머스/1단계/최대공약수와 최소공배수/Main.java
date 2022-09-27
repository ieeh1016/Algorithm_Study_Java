class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int maxNumber = Math.max(n,m);
        int minNumber = Math.min(n,m);
        
        int max = 0;
        int i = 1;
        while(maxNumber > i){
            if(maxNumber % i == 0 && minNumber % i == 0 ){
                max = i;
            }
            i++;
        }
        
        int min = max * (n / max) * (m / max);

        answer[0] = max;
        answer[1] = min;

        
        
        
        
        return answer;
    }
}