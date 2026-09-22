class Solution {
    public double myPow(double x, int n) {
        long val = n;
        if(val < 0){
            x = 1/x;
            val = -val;
        }
        double res = 1.0;
        double currpro = x;
        while(val > 0){
            if(val % 2 == 1){
                res *= currpro;
            }
            currpro *= currpro;
            val /= 2;

        }
    return res;
    }
}