class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        
        String[] temp = s.toLowerCase().split(" ");
        
        for(int i = 0; i < temp.length; i++){
            if(temp[i].length() == 1)
                sb.append(Character.toUpperCase(temp[i].charAt(0)));
            else{
            sb.append(Character.toUpperCase(temp[i].charAt(0)) 
                     + temp[i].substring(1));
            }
            if(i != temp.length - 1) sb.append(" ");
        } 
        return sb.toString();
    }
}