class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x1 = rec1[0],x2 = rec1[2] , y1 = rec1[1], y2 = rec1[3];
        int x3 = rec2[0],x4 = rec2[2] , y3 = rec2[1], y4 = rec2[3];
        if(x1 >= x4 || x2 <= x3 || y1 >= y4 || y2 <= y3) return false;
        return true;
    }
}