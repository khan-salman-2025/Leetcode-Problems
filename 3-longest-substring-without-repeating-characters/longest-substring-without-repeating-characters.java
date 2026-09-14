class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int maxl = 0;
        int currlen = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(sb.indexOf(String.valueOf(ch)) == -1){
                sb.append(ch);
                currlen++;
                if(maxl <= currlen) maxl = currlen;
            }else{
                int idx = sb.indexOf(String.valueOf(ch));
                sb.delete(0,idx + 1);
                sb.append(ch);
                currlen = sb.length();
                if(maxl < currlen) maxl = currlen;
            }
        }   
        return maxl;
    }
}