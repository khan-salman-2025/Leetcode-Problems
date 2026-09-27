class Solution {
    public int trap(int[] height) {
        if(height.length == 0) return 0;
        int low = 0, high = height.length - 1;
        int leftpro = 0, rightpro = 0, total = 0;
        while(low < high){
            if(height[low] < height[high]){
                if(height[low] >= leftpro){
                    leftpro = height[low];
                }else{
                    total += leftpro - height[low];
                }
                low++;
            }else{
                if(height[high] >= rightpro){
                    rightpro = height[high];
                }else{
                    total += rightpro - height[high];
                }
                high--;
            }
        }
        return total;
    }
}