package com.nexttech.ProjectJAVA;

import java.util.Stack;

class Parser {

public boolean isBalanced(String str) {
	
Stack <Character> stack = new Stack<Character>();
for (int i=0; i<str.length(); i++)
{
	
	char ch = str.charAt(i);
	if (ch=='('|| ch=='{' || ch=='[')
	{
		stack.add(ch);
	}
	
	else if (ch==')' || ch=='}' || ch==']')
{
	if (stack.isEmpty() || ch==')' && stack.peek()!='(' || ch=='}' && stack.peek()!='{'||ch==']' && stack.peek()!='[')
	{
		return false;
	}
	stack.pop();
}
}
return stack.isEmpty();
}	
}