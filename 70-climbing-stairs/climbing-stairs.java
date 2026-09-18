class Solution {
    static int[] arr = new int[101];
    static{
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i <= 100; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
    }
    public int climbStairs(int n) {
        return arr[n];
    }
}