class Solution {
    int max = 1;
    int idx = 0,endx = 0;
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
         for(int i=0;i<s.length();i++){
            substr(i,i,s);
            substr(i,i+1,s);
         }
        StringBuilder sb = new StringBuilder();
        for(int i=idx;i<=endx;i++){
            sb.append(s.charAt(i));
        }
        String str = sb.toString();
        return str;
    }
    void substr(int i,int j,String s){
        while(i>=0 && j< s.length() && s.charAt(i) == s.charAt(j)){
            if(j-i+1 > max){ 
                max = j-i+1;
            idx = i;
            endx = j;
            }
            i--;
            j++;
        }
    }
}