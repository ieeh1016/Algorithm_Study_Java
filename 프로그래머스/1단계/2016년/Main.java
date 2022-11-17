class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] arr = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int alldate = 0;
        for(int i=0; i<a-1; i++){
            alldate += date[i];
        }
        alldate += b - 1;
        
        answer = arr[alldate%7];
        
        return answer;
    }
}