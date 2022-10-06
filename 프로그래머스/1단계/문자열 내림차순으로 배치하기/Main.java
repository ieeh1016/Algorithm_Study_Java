import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        ArrayList<Character> arrList = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            arrList.add(s.charAt(i));
        }
        
        Collections.sort(arrList, Collections.reverseOrder());
        
        for(char x : arrList){
            answer += x;
        }
     
        return answer;
    }
}