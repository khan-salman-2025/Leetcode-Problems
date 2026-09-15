class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i = 0, j = 1;
        Set<Integer> set = new HashSet<>();
        for(int k = 0; k < len; k++){
            set.add(nums[k]);
        }
        while(j < len){
              if(nums[i] == nums[j]){
                j++;
              }else{
                i++;
                nums[i] = nums[j];
                j++;
                
              }
        }
        return set.size();
    }
}