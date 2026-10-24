class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = sqrd(n);
        while(fast != 1 && slow != fast){
            slow = sqrd(slow);
            fast = sqrd(sqrd(fast));
        }
        return fast == 1;
    }
    public int sqrd(int n){
        int total = 0;
        while(n != 0){
            int num = n % 10;
            total += num * num;
            n /= 10;
        }
        return total;
    }
}