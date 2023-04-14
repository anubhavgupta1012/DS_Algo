package com.ds.stack;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String str = "[()]{}{[()()]()}";

        Stack<Character> stack = new Stack<>();
        for (Character c : str.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (c == '}' && !stack.empty() && stack.peek() == '{') stack.pop();
                else if (c == ']' && !stack.empty() && stack.peek() == '[') stack.pop();
                else if (c == ')' && !stack.empty() && stack.peek() == '(') stack.pop();
                else stack.push(c);
            }
        }

        if (stack.size() == 0)
            System.out.println("balanced");
        else
            System.out.println("Unbalanced");
    }
}
