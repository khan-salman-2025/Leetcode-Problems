class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for(int ele : piles){
            high = Math.max(high, ele);
        }
        int ans = 0;
        while(low <= high){
            int mid = (low + (high - low)/2);
            if(valid(piles, h ,mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public boolean valid(int[] piles, int h, int k){
        long need = 0;
        for(int pile : piles){
            need += (pile + k -1) / k;
        }
        return need <= h;
    }
}