import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] a = {-1};
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                arrList.add(arr[i]);
            }
        }
        if(arrList.size() == 0) return a;
        
        Collections.sort(arrList);
        
        int[] answer = new int[arrList.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}