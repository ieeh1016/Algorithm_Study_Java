class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int len = right - left + 1;
        
        for(int i=left; i<right+1; i++){
            int count = 0;
            int num = i;
            while(num > 0){
                if(i % num == 0){
                    count++;
                }
                num--;
            }
            if(count % 2 == 0){
                answer = answer + i;
            }
            else{
                answer = answer - i;
            }
        }
        
        return answer;
    }
}