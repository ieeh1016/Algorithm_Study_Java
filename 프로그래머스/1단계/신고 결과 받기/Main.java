import java.util.*;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        //1. 중복을 제거한다 여기서는 HashSet으로 만들어줘서 중복을 제거한다.
        HashSet<String> reportSet = new HashSet<>();
        for(String rep : report) reportSet.add(rep);
        
        //2. 신고당한사람을 = Key ---- 신고 당한사람을 신고한 사람들 = value
        //여기서는 신고당한 사람은 중복될 수 없기 때문에 HashMap으로 만듬
        HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
        for(String rep : reportSet){
            int blankIdx = rep.indexOf(" ");
            String reporter = rep.substring(0, blankIdx);
            String reportee = rep.substring(blankIdx + 1);
            
            ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee , null);
            if(reporterList == null) reporterList = new ArrayList<String>();
            
            reporterList.add(reporter);
            notifyListHash.put(reportee, reporterList);
            
        }
        HashMap<String, Integer> reporterHash = new HashMap<String, Integer>();
        for(ArrayList<String> notifyList : notifyListHash.values()){
            if(notifyList.size() >= k ){
                 for(String reporter : notifyList){
                     reporterHash.put(reporter, reporterHash.getOrDefault(reporter, 0) + 1);
                 }
            }
        }
        
        for(int i=0; i<id_list.length; i++){
            answer[i] = reporterHash.getOrDefault(id_list[i], 0);
        }

        
        return answer;
    }
}