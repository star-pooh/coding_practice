class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        int idx = 0;
        
        for (long number : numbers) {
            String binaryString = Long.toBinaryString(number);
            StringBuilder newBinaryString = new StringBuilder();
        
            if (binaryString.endsWith("0")) {
                // 가장 마지막 비트가 0인 경우, 0을 1로 변경 -> 1개의 비트 증가
                newBinaryString.append(binaryString, 0, binaryString.lastIndexOf("0")).append("1");
            } else if (binaryString.endsWith("1") && binaryString.contains("0")) {
                // 가장 마지막 비트가 1인 경우, 가장 앞쪽의 0을 1로 변경하고 그 뒤의 0을 1로 변경 -> 2개의 비트 증가
                newBinaryString.append(binaryString, 0, binaryString.lastIndexOf("0"));
                newBinaryString.append("10");
                newBinaryString.append(binaryString.substring(binaryString.lastIndexOf("0") + 2));
            } else if (binaryString.endsWith("1")) {
                newBinaryString.append("10");
                newBinaryString.append(binaryString.substring(binaryString.indexOf("1") + 1));
            } else {
                // 중간에 0인 비트가 있는 경우, 마지막 0을 1로 변경 -> 1개의 비트 증가
                newBinaryString.append(binaryString, 0, binaryString.length() - 1);
                newBinaryString.append("1");                
            }
            
            answer[idx++] = Long.parseLong(newBinaryString.toString(), 2);
        }

        return answer;
    }
}