/*
 * A stack is a first-in-last-out queue. Write a program calld MyIntStack, 
 * which uses an array to store the contents, restricted to int.
 * Write a test program.
 * Try:
 * Modify the push() method to throw an IllegalStateException if the stack is full.
 * Modify the push() to return true if the operation is sucessful, or false otherwise.
 * Modify the push() to increase the capacity by reallocating another array, if the stack is full.
*/
package oop.excercises.MyIntStack;

import java.util.Arrays;

public class MyIntStack {

	private int[] contents;
	private int tos; // Top of the stack

	public MyIntStack(int capacity) {
		contents = new int[capacity];
		tos = -1;
	}

	// Modify the push() to increase the capacity by reallocating another array,
	// if the stack is full.
	public void push(int element) {
		if (this.isFull()) {
			int[] newContents = Arrays.copyOf(contents, contents.length * 2);
			contents = newContents;
		}
		contents[++tos] = element;
	}

	public int pop() {
		return contents[tos--];
	}

	public int peek() {
		return contents[tos];
	}

	public boolean isEmpty() {
		return tos < 0;
	}

	public boolean isFull() {
		return tos == contents.length - 1;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i <= tos; i++) {
			sb.append(contents[i]);
			if (i != tos) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

}
