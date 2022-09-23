import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i : d){
            arrList.add(i);
        }
        Collections.sort(arrList);
        
        for(int i : arrList){
            sum = sum + i;
            if(sum <= budget){
                answer++;
            }
        }
        
        return answer;
    }
}