import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> totalParkingTimeMap = new HashMap<>();
        Map<String, String> parkingMap = new HashMap<>();
        
        // 주차 시간 계산
        for (String record : records) {
            String[] recordInfo = record.split(" ");
            String time = recordInfo[0];
            String carNumber = recordInfo[1];
            String type = recordInfo[2];
            
            if (type.equals("IN")) {
                parkingMap.put(carNumber, time);
            } else {
                int parkingTime = calParkingTime(parkingMap.get(carNumber), time);
                totalParkingTimeMap.put(carNumber, totalParkingTimeMap.getOrDefault(carNumber, 0) + parkingTime);
                
                parkingMap.remove(carNumber);
            }
        }
        
        // 출차 기록이 없는 차에 대한 주차 시간 계산
        for (String carNumber : parkingMap.keySet()) {
            int parkingTime = calParkingTime(parkingMap.get(carNumber), "23:59");
            totalParkingTimeMap.put(carNumber, totalParkingTimeMap.getOrDefault(carNumber, 0) + parkingTime);
        }
        
        // 차량 번호가 작은 순서로 정렬
        List<String> carNumberList = new ArrayList<>(totalParkingTimeMap.keySet());
        Collections.sort(carNumberList);
        
        int[] parkingFeeArr = new int[carNumberList.size()];
        int idx = 0;
        
        // 차량 요금 계산
        for (String carNumber : carNumberList) {
            parkingFeeArr[idx++] = calParkingFee(totalParkingTimeMap.get(carNumber), fees);
        }
        
        return parkingFeeArr;
    }
    
    private int calParkingTime(String startTime, String endTime) {
        String[] startTimeArr = startTime.split(":");
        String[] endTimeArr = endTime.split(":");
        
        return (Integer.parseInt(endTimeArr[0]) * 60 + Integer.parseInt(endTimeArr[1]))
            - (Integer.parseInt(startTimeArr[0]) * 60 + Integer.parseInt(startTimeArr[1]));
    }
    
    private int calParkingFee(int totalParkingTime, int[] fees) {
        int defaultTime = fees[0];
        int defaultFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        
        if (totalParkingTime <= defaultTime) {
            return defaultFee;
        } 
        
        if ((totalParkingTime - defaultTime) % unitTime == 0) {
            return defaultFee + (totalParkingTime - defaultTime) / unitTime * unitFee;
        } else {
            return defaultFee + ((totalParkingTime - defaultTime) / unitTime + 1) * unitFee;
        }
    }
}