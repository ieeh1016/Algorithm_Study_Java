class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        
        int len = absolutes.length;
        
        int sum = 0;
        
        for(int i=0; i<len; i++){
            int a = 0;
            if(signs[i] == true){
                a = absolutes[i];
            }
            else{
                a = 0 - absolutes[i];
            }
            sum = sum + a;
        }
        answer = sum;
        
        return answer;
    }
}