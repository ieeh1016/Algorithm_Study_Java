class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int num = phone_number.length()-4;
        for(int i=0; i<num;i++){
            answer = answer + "*";
        }
        for(int i=num; i<phone_number.length(); i++){
            answer = answer + phone_number.charAt(i);
        }
        return answer;
    }
}