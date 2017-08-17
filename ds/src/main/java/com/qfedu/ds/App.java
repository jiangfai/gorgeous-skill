package com.qfedu.ds;

// (2 + 3) * (5 + 4)
// 2 3 + 5 4 + * - 逆波兰表达式
// Step1: 中缀表达式转换成逆波兰表达式
// Step2: 对逆波兰表达式求值
public class App {
	
	public static boolean isValidBracket(String exp) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0, len = exp.length(); i < len; ++i) {
			char currentChar = exp.charAt(i);
			if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
				stack.push(currentChar);
			} else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
				if (stack.isEmpty()) return false;
				char leftChar = stack.pop();
				if ((leftChar == '(' && currentChar != ')') ||
						(leftChar == '[' && currentChar != ']') ||
						(leftChar == '{' && currentChar != '}')) return false;
			}
		}
		return stack.isEmpty();
	}
	
//	public static void main(String[] args) {
//		System.out.println("Hello World!");
//	}
}
