package Stack.com;
//stack implementation how it works
public class New {
	static int cap=5;
	 static int top=-1;
	 static int[] stack=new int[cap];
	public static void push(int ele) {
		if(isFull()) 
			System.out.println("stack is full");
		else 
			stack[++top]=ele;
		
	}
	public static boolean isFull() {
		if(top==cap-1)
			return true;
		else
			return false;
	}
	public static void pop() {
		if(isEmpty()) 
			System.out.println("stack empty");
		else
			top--;
	}
	public static boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	public static void display() {
		for(int i=0;i<=top;i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	public static void size() {
		int c=0;
		if(isEmpty()) {
			System.out.println("stack is empty");
		}else {
			for(int i=0;i<=top;i++) {
				c++;
			}
			System.out.println("size: "+c);
		}	
	}
	public static void peak() {
		System.out.println(stack[top]+" ");
	}
public static void main(String[] args) {
	push(20);
	push(100);
	push(50);
	push(60);
	display();
	peak();
	size();
	pop();
	display();
	pop();
	pop();
	display();
	size();
	
	
}
}
