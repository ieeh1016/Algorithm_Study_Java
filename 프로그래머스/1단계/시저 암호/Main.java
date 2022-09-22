class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                answer += " ";
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                if(s.charAt(i) + n > 'z'){
                    answer = answer + (char)((int)s.charAt(i) + n - 26);
                }
                else answer = answer + (char)(s.charAt(i) + n);
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                if(s.charAt(i) + n > 'Z'){
                    answer = answer + (char)((int)s.charAt(i) + n - 26);
                }
                else answer = answer + (char)(s.charAt(i) + n);
            }
        }
        
        return answer;
    }
}
// a = 97 z = 122 A = 65 Z = 90