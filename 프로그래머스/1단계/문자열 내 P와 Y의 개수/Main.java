class Solution {
    boolean solution(String s) {
        boolean answer = false;
        s = s.toLowerCase();
        int pcount=0;
        int ycount=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p'){
                pcount++;
            }
            else if(s.charAt(i) == 'y'){
                ycount++;
            }
        }
        
        if(pcount == ycount){
            answer = true;
        }
        
        return answer;
    }
}