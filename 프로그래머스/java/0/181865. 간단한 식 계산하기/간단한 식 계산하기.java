class Solution {
    public int solution(String binomial) {
        String[] target = binomial.split(" ");
        int num1 = Integer.parseInt(target[0]);
        int num2 = Integer.parseInt(target[2]);
        String operator = target[1];
        
        switch(operator) {
            case "+" -> { return num1 + num2; }
            case "-" -> { return num1 - num2; }
            case "*" -> { return num1 * num2; }
            default -> { return 0; }
        }
    }
}