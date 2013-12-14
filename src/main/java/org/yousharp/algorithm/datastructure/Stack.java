package org.yousharp.algorithm.datastructure;

/**
 * stack definition
 * User: Daniel
 * Date: 13-12-14
 * Time: 上午9:01
 */
public class Stack {
	public ListNode top;

	/**
	 * get the first node of the stack
	 * @return
	 */
	public ListNode peek() {
		if (null == top) {
			return null;
		}
		return top;
	}

	/**
	 * push a new node to the stack
	 * @param newNode
	 */
	public void push(ListNode newNode) {
		if (null != newNode) {
			newNode.next = top;
			top = newNode;
		}
	}

	/**
	 * 
	 * @return
	 */
	public ListNode pop() {
		if (null == top) {
			return null;
		}
		ListNode topBak = new ListNode(top.value);
		top = top.next;
		return topBak;
	}
}
