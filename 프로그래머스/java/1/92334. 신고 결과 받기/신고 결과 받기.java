import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int len = id_list.length;
        // 신고 당한 횟수 기록
        int[] respondentCount = new int[len];
        // 신고 내역 기록
        boolean[][] checkReportInfo = new boolean[len][len];
        // id와 인덱스 매핑 기록
        Map<String, Integer> idMap = new HashMap<>();
        // 신고자가 받을 결과 메일의 수
        int[] receiveMailAmount = new int[len];
        
        for (int i = 0; i < len; i++) {
            idMap.put(id_list[i], i);
        }
        
        for (String r : report) {
            String[] reportInfo = r.split(" ");
            int reporterIdx = idMap.get(reportInfo[0]);
            int respondentIdx = idMap.get(reportInfo[1]);
            
            // 동일 신고 1회 처리
            if (!checkReportInfo[reporterIdx][respondentIdx]) {
                respondentCount[respondentIdx]++;
                checkReportInfo[reporterIdx][respondentIdx] = true;
            }
        }
        
        // 신고자
        for (int i = 0; i < len; i++) {
            int mailAmount = 0;
            // 피신고자
            for (int j = 0; j < len; j++) {
                if (checkReportInfo[i][j] && respondentCount[j] >= k) {
                    mailAmount++;
                }
            }
            receiveMailAmount[i] = mailAmount;
        }
        
        return receiveMailAmount;
    }
}