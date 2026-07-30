class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                stack.push(ch);
            }
            else{
                stack.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:stack){
            sb.append(c);
        }
        return sb.toString();
    }
}