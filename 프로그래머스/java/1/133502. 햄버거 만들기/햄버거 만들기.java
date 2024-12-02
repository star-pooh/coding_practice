class Solution {
    public int solution(int[] ingredient) {
        int cnt = 0;
        StringBuilder temp = new StringBuilder();

        for (int i : ingredient) {
            temp.append(i);

            if (temp.length() >= 4 && temp.substring(temp.length() - 4, temp.length()).equals("1231")) {
                cnt++;
                temp.delete(temp.length() - 4, temp.length());
            }
        }
        return cnt;
    }
}