class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0) return t.charAt(0);
        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ts);
        char ans = ts[ts.length - 1];
        for(int i = 0; i < cs.length; i++){
            if(cs[i] != ts[i]){
                ans = ts[i];
                break;
            }
        }
        return ans;
    }
}