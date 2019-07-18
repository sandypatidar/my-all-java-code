import java.io.IOException;
class Stack {
	private int maxSize;
	private int top;
	private int[] data;
	public Stack(int s) {
		maxSize = s;
		data = new int[maxSize];
		top = -1;
	}
	public void push(int p) {
		data[++top] = p;
	}
	public int pop() {
		return data[top--];
	}
	public int peek(){
		return data[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
}
public class AddStack {
	static int num;
	static int ans;
	static Stack theStack;
	public static void main(String[] args) {
		num = 50;
		stackAddition();
		System.out.println("sum = "+ans);
	}
	public static void stackAddition(){
		theStack = new Stack(1000); 
		ans = 0;
		while(num >0){
			theStack.push(num);
			--num;
		}
		while(!theStack.isEmpty()) {
			int newN = theStack.pop();
			ans += newN;
		}
	}
}