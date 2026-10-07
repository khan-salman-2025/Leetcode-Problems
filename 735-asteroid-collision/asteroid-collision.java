class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
            int aster = asteroids[i];
            boolean explode = false;
            while(!st.isEmpty() && st.peek() > 0 && aster < 0){
                if(st.peek() == -aster) st.pop();
                else if(st.peek() < -aster){
                    st.pop();
                    continue;
                }
                explode = true;
                break;
            }
            if(!explode){
                st.push(aster);
            }
        }
        int[] res = new int[st.size()];
        for(int i = res.length - 1; i >= 0; i--){
            res[i] = st.pop();
        }
        return res;
    }
}