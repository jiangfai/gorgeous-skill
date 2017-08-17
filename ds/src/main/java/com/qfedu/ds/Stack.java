package com.qfedu.ds;

/**
 * 栈 (FILO)
 * @author 骆昊
 *
 * @param <T> 元素类型的泛型参数
 */
public class Stack<T> {
	private List<T> elements = new List<>();
	
	/**
	 * 入栈 (在栈顶位置插入元素)
	 * @param elem
	 */
	public void push(T elem) {
		elements.add(elem);
	}
	
	/**
	 * 出栈 (从栈顶位置移除元素)
	 * @return 栈顶元素
	 */
	public T pop() {
		return elements.removeAt(elements.size() - 1);
	}
	
	/**
	 * 查看栈顶
	 * @return 栈顶元素
	 */
	public T peek() {
		return elements.get(elements.size() - 1);
	}
	
	/**
	 * 判断是否为空
	 * @return 为空返回true否则返回false
	 */
	public boolean isEmpty() {
		return elements.size() == 0;
	}
}
