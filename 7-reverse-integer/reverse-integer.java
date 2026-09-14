class Solution {
    public int reverse(int x) {
        boolean negsign = false;
        if(x < 0) negsign = true;
        long rev = 0, rem = 0, max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
        while(x != 0){
            rem = x % 10;
            rev = rev *  10 + rem;
            if(rev > max || rev < min) return 0;
            x /= 10;
        }
        // if(negsign) return (int)(rev);
        return (int)rev;
    }
}