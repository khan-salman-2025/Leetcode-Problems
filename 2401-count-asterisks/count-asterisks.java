class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean inside = false;
        for(char ch : s.toCharArray()){
            if(ch == '|') inside = !inside;
            else if(ch == '*' && !inside) count++;
        }
        return count;
    }
}