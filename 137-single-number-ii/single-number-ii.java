class Solution {
    public int singleNumber(int[] nums) {
        long res = 0;
        for(int i = 0; i <= 31; i++){
            int count = 0;
            for(int ele : nums){
                if((ele & (1 << i)) != 0) count++;
            }
            if(count % 3 != 0){
                res = res | (1 << i);
            }
        }
        return (int)res;
    }
}