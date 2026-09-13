class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int len = str.length() - 1, count = 0;
        for(int i = len;i >= 0; i--){
            char ch = str.charAt(i);
            if(ch == ' ') break;
            else{
                count++;
            }
        }
        return count;
    }
}