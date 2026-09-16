class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int i = 0, j = len - 1;
        while(i <= j){
            if(nums[j] % 2 == 0 && nums[i] % 2 != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }else if(nums[j] % 2 == 0 && nums[i] % 2 == 0){
                i++;
            }else if(nums[j] % 2 != 0 && nums[i] % 2 != 0){
                j--;
            }else{
                i++;
                j--;
            }
        }
        return nums;
    }
}