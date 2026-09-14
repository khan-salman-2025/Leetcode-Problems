class Solution {
    public int myAtoi(String s) {
        int sign = 1, i = 0, len = s.length();
        long result = 0;
        // First case skipping any type og white space
        while(i < len && s.charAt(i) == ' '){
            i++;
        }
        // checking for any kind of signs if present
        if(i < len && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            // if + no problem else need to remember sign value
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }
        // now to read the real number
        while(i < len && (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
            if(sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(sign*result);
    }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
        // My first approach requires a lot of loops and checking conditions
        // int len = s.length();
        // int c = 0,idx = 0,pls = 0;
        // long dig = 0;
        // boolean seen = false;
        // for(int i=0;i<len;i++){
        //     char ch = s.charAt(i);
        //     char sec = (i+1 < len) ? s.charAt(i+1) : ' ';
        //     if(Character.isWhitespace(ch)){
        //         if(seen) return 0;
        //         continue;
        //     }
        //     if(ch == '+' && sec == '-'){
        //        return 0;
        //     }
        //     if(ch == '-' && sec == '+'){
        //         return 0;
        //     }
        //     if(ch == '-'){
        //         if(seen) return 0;
        //         seen = true;
        //         c++;
        //         continue;
        //     }
        //     if(ch == '+'){
        //          if(seen) return 0;
        //         seen = true;
        //         pls++;
        //         continue;
        //     }
        //     if(Character.isLetter(ch) || !Character.isLetterOrDigit(ch)){
        //         return 0;
        //     }
        //     if(Character.isDigit(ch)){
        //    idx = i;
        //    break;
        //     }
        // }
        //  for(int j=idx;j<len;j++){
        //      char ml = s.charAt(j);
        //     if(!Character.isDigit(ml)){
        //         break;
        //     }
        //     int temp = ml-'0';
        //      if(dig > (Integer.MAX_VALUE - temp) / 10) {
        // return (c != 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        //             }
        //        dig = (dig*10) + temp;
        //             }
        //             if(c != 0){
        //                 dig = (-1)*dig;
        //             }
        //             if(dig < Integer.MIN_VALUE){
        //                       return (Integer.MIN_VALUE);
        //             }
        //             else if( dig > Integer.MAX_VALUE){
        //                 return Integer.MAX_VALUE;
        //             }
        // return (int)dig;