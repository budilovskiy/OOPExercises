package oop.excercises.MyIntStack;

public class TestMyIntStack {

	public static void main(String[] args) {
		MyIntStack stack = new MyIntStack(10);
		System.out.println(stack); // [] empty stack
		
		for (int i = 0; i < 100; i++) {
			stack.push(i);
		}
		
		System.out.println(stack);	// [0...99]
		
		for (int i = 0; i < 50; i++) {
			stack.pop();
		}
		
		System.out.println(stack); // [0...49]
		
		System.out.println(stack.pop()); // 49
		System.out.println(stack.pop()); // 48
		System.out.println(stack.pop()); // 47
		stack.push(100);
		System.out.println(stack.pop()); // 100

	}

}
