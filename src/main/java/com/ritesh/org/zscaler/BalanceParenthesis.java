package com.ritesh.org.zscaler;

import java.util.Stack;

public class BalanceParenthesis
{
    public static void main(String[] args)
    {
        System.out.println(isParenthesisBalanced("({[]})"));
    }

    private static boolean isParenthesisBalanced(String ipStr)
    {
        boolean isCorrect = true;
        if(ipStr == null || ipStr.length() == 0 || ipStr.length()%2 != 0)
        {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i< ipStr.length(); i++)
        {
            char tmpChar = ipStr.charAt(i);
            if(tmpChar == '(' || tmpChar == '{' || tmpChar == '[')
            {
                stack.add(ipStr.charAt(i));
            }
            else if(tmpChar == ')' || tmpChar == '}' || tmpChar == ']')
            {
                if(stack.isEmpty()){
                    return false;
                }
                char checkChar = stack.pop();
                switch(tmpChar)
                {
                    case ')':
                        if(checkChar != '(')
                            return false;
                        break;
                    case '}':
                        if(checkChar != '{')
                            return false;
                        break;
                    case ']':
                        if(checkChar != '[')
                            return false;
                        break;
                }
            }
        }
        if(stack.size()>0)
        {
            isCorrect = false;
        }
        return isCorrect;
    }
}
