package day4_labbook;

public class StackImplementation {
	public static void main(String[] args) {
		Stack stack1 = new Stack(4);
		stack1.push(0);
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.displayStack();
		Stack stack2 = new Stack(5);
		System.out.println();
		System.out.println();
		stack2.push(6);
		stack2.push(7);
		stack2.push(8);
		stack2.push(9);
		stack2.push(10);
		stack2.displayStack();
		System.out.println();
		stack2.pop();
		System.out.println();
		stack2.displayStack();
	}
}

class Stack {
	private int arr[];
	
	private int top;
	
	private int size;
	
	public Stack(int size) {
		arr = new int[size];
		this.size = size;
		top = -1;
	}
	
	public void push(int number) {
		if(top == this.size - 1) {
			System.out.println("Stack overflow");
		}else {
			arr[++top] = number;
			System.out.println("Pushed "+arr[top]);
		}
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			return arr[top--];
		}
	}
	
	public int getSize() {
		return top + 1;
	}
	
	public void displayStack() {
		for(int i=0;i<=top;i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
