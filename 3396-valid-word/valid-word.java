class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        boolean hasv = false, hasc = false;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isLetter(ch)){
                char low = Character.toLowerCase(ch);
                if(low == 'a' || low == 'e' || low == 'o' || low == 'u' || low == 'i'){
                    hasv = true;
                }else{
                    hasc = true;
                }
            }
        }
        if(hasv == true && hasc == true) return true;
        else return false;
    }
}