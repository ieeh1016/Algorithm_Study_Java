class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = Integer.toString(n,3);
        String str = "";
        for(int i=a.length()-1; i>=0; i--){
            str = str + a.charAt(i);
        }
        answer= Integer.parseInt(str, 3);
        return answer;
    }
}