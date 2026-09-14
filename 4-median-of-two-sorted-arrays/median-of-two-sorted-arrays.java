class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        float[] arr = new float[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length + nums2.length; i++){
            if(i <= nums1.length - 1){
                arr[i] = nums1[i];
            }else{
                arr[i] = nums2[i-nums1.length];
            }
        }
        Arrays.sort(arr);
        float median;
        int x = nums1.length + nums2.length;
        if(x % 2 != 0){
            return arr[(x-1)/2];
        }else{
            return (arr[x/2] + arr[(x/2) - 1])/2; 
        }
    }
}