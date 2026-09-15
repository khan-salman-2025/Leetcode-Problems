class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<>();
        for(int i = 0; i  < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                stck.push(ch);
            }else if(ch == '}'){
                if(!stck.isEmpty()){
                    if(stck.peek() == '{') stck.pop();
                    else stck.push(ch);
                }else{
                    stck.push(ch);
                }
            }else if(ch == ']'){
                if(!stck.isEmpty()){
                    if(stck.peek() == '[') stck.pop();
                    else stck.push(ch);
                }else{
                    stck.push(ch);
                }
            }else if(ch == ')'){
                if(!stck.isEmpty()){
                    if(stck.peek() == '(') stck.pop();
                    else stck.push(ch);
                }else{
                    stck.push(ch);
                }
            }
        }
        if(stck.isEmpty()) return true;
        return false;
    }
}