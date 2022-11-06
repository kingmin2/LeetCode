class Solution {
    public boolean backspaceCompare(String s, String t) {
        return backspaceString(s).equals(backspaceString(t));
    }
    
    private  Stack<Character> backspaceString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if ('#' != c) {
                stack.push(c);
                continue;
            }
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack;
    }
}