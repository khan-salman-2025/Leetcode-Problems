class Solution {
    static int max = 5000000;
    static int[] pre = new int[max + 1];
    static boolean ispre = false;
    static void prime(){
        boolean[] pc = new boolean[max + 1];
        Arrays.fill(pc, true);
        pc[0] = false;
        pc[1] = false;
        for(int i =  2; i *  i <= max; i++){
            if(pc[i]){
                for(int j = i * i; j <= max; j += i){
                    pc[j] =false;
                }
            }
        }
        int count = 0;
        for(int i= 0; i <= max; i++){
            if(pc[i]) count++;
            pre[i] = count;
        }
        ispre = true;
    }
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        if(!ispre){
            prime();
        }
        return pre[n - 1];
    }
}