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
	public boolean push(int element) {
		if (this.isFull()) {
			int[] newContents = Arrays.copyOf(contents, contents.length * 2);
			contents = newContents;
		}
		contents[++tos] = element;
		return true;
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
