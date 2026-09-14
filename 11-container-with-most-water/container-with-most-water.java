class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0,het = height.length;
        int leftw = 0, rightw = het - 1;
        while(leftw < rightw){
            int heights = Math.min(height[leftw], height[rightw]);
            int width = rightw - leftw;
            int area = heights * width;
            if(maxarea < area) maxarea = area;
            if(height[leftw] > height[rightw]) rightw--;
            else leftw++;
        }
        return maxarea;
    }
}