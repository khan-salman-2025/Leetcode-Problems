class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if(strs == null || len == 0) return "";
        Arrays.sort(strs);
        int i = 0;
        String st = strs[0];
        String last = strs[strs.length - 1];
        while(i < st.length() && i < last.length() && (st.charAt(i) == last.charAt(i))){
            i++;
        }
        return st.substring(0,i);
    }
}