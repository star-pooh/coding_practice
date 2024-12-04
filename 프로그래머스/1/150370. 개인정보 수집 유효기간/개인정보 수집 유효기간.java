import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> targetList = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        
        // 약관 정보 매핑
        for (String term : terms) {
            String[] termInfo = term.split(" ");
            termMap.put(termInfo[0], Integer.parseInt(termInfo[1]));
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] privacyInfo = privacies[i].split(" ");
            // 개인정보의 유효기간이 지났다면 파기
            if (calcExpire(today, privacyInfo, termMap)) {
                targetList.add (i + 1);
            }
        }
        
        int[] answer = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            answer[i] = targetList.get(i);
        }
        return answer;
    }
    
    public boolean calcExpire(String today, String[] privacyInfo, Map<String, Integer> termMap) {
        String[] todayDateInfo = today.split("\\.");
        int todayYear = Integer.parseInt(todayDateInfo[0]);
        int todayMonth = Integer.parseInt(todayDateInfo[1]);
        int todayDay = Integer.parseInt(todayDateInfo[2]);
        
        String[] privacyDateInfo = privacyInfo[0].split("\\.");
        int privacyYear = Integer.parseInt(privacyDateInfo[0]);
        int privacyMonth = Integer.parseInt(privacyDateInfo[1]);
        int privacyDay = Integer.parseInt(privacyDateInfo[2]);
        
        int expire = termMap.get(privacyInfo[1]);
        
        // 달 수가 12보다 크다면 년도를 계산
        privacyMonth += expire;
        while (privacyMonth > 12) {
            privacyYear++;
            privacyMonth -= 12;
        }
        
        // 오늘 날짜가 개인정보 수집 날짜보다 크다면 파기 
        if (todayYear > privacyYear) {
            return true;
        } else if (todayYear == privacyYear && todayMonth > privacyMonth) {
            return true;
        } else if (todayYear == privacyYear && todayMonth == privacyMonth && todayDay >= privacyDay) {
            return true;
        }
        return false;  
    }
}