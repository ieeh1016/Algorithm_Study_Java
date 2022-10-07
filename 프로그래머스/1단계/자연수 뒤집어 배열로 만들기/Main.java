class Solution {
    public int[] solution(long n) {
        
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        int cnt = 0;
        while(n>0){
            answer[cnt++] = (int)(n % 10);
            n = n / 10;
        }
        
        return answer;
        
        
    }
}