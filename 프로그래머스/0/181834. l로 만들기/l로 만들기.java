class Solution {
    public String solution(String myString) {
        for (int i = 0; i < myString.length(); i++) {
            char target = myString.charAt(i);
            
            if (target < 'l') {
                myString = myString.replace(String.valueOf(target), "l");
            }
        }
        
        return myString;
    }
}