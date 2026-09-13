class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if(len == 0) return 0;
        int count = len, index = 0;
        int[] ans = new int[len];
        for(int i=0;i<len;i++){
            if(nums[i] == val){
                count--;
            }
            else{
                ans[index] = nums[i];
                index++;
            }
        }
        for(int i=0;i<len;i++){
            nums[i] = ans[i];
        }
        return count;
    }
}