class Solution {
    public int strStr(String haystack, String needle) {
        int haylen = haystack.length();
        int needlen = needle.length();
        if(needlen > haylen) return -1;
        int reqlen = haylen - needlen;
        for(int i = 0; i <= reqlen; i++){
            boolean flag = true;
            for(int j = 0; j < needlen; j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag) return i;
        }
        return -1;
    }
}