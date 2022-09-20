class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int widthMax = 0;
        int lengthMax = 0;
        
        int[][] arr = new int[sizes.length][2];
        
        for(int i=0; i<sizes.length; i++){
            arr[i][0] = Math.max(sizes[i][0], sizes[i][1]);
            arr[i][1] = Math.min(sizes[i][0], sizes[i][1]);
        }
                    
        for(int j=0; j<sizes.length; j++){
            if(arr[j][0] > widthMax){
                widthMax = arr[j][0];
            }
        }

        for(int j=0; j<sizes.length; j++){
            if(arr[j][1] > lengthMax){
                lengthMax = arr[j][1];
            }
        }

        answer = widthMax * lengthMax;
        
        return answer;
    }
}