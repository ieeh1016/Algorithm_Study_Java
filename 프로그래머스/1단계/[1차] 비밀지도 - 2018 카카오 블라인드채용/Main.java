class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i=0; i<n; i++){
            String str = Integer.toString(arr1[i], 2);
            while(str.length() < n){
                str = "0"+str;
            }
            String str2 = Integer.toString(arr2[i], 2);
            while(str2.length() < n){
                str2 = "0"+str2;
            }

            for(int j=0; j<n; j++){
                if(str.charAt(j) == '0' && str2.charAt(j) == '0'){
                    if(answer[i] == null) answer[i] = " ";
                    else answer[i] = answer[i] + " ";
                }
                else{
                    if(answer[i] == null) answer[i] = "#";
                    else answer[i] = answer[i] + "#";
                }
            }

        }
        return answer;
    }
}