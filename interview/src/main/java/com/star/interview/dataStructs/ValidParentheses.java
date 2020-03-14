package com.star.interview.dataStructs;

import java.util.Stack;

/**
 * @ClassName ValidParentheses
 * @Description TODO
 * @Author 96598
 * @Date 2020/2/26 14:12
 * @ModifyDate 2020/2/26 14:12
 * @Version 1.0
 */
public class ValidParentheses {

    public boolean valid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topCh = stack.pop();
                if (ch == ')' && topCh != '(') {
                    return false;
                }
                if (ch == ']' && topCh != '[') {
                    return false;
                }
                if (ch == '}' && topCh != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().valid("{1*2}+()[()[]]"));
        System.out.println(new ValidParentheses().valid("{}()[()[]"));
    }
}
