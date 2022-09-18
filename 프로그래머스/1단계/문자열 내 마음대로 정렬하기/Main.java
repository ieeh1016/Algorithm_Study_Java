import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        ArrayList<String> arrList = new ArrayList<>();
        
        for(int i=0; i<strings.length; i++){
            arrList.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arrList);
        
        for(int i=0; i<strings.length; i++){
            answer[i] = arrList.get(i).substring(1, arrList.get(i).length());
        }
        
        return answer;
    }
}