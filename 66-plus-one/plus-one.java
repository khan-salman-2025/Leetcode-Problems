class Solution {
    public int[] plusOne(int[] digits) {
        int idx = digits.length;
        for(int i = idx - 1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        // if all are 9's
        int[] arr = new int[idx + 1];
        arr[0] = 1;
        return arr;
    }
}