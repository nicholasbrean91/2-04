import java.util.ArrayList;
public class Stack {
	private final ArrayList<Integer> list = new ArrayList<Integer>();
	
	public void push(int num) {
		list.add(num);
	}		
	public void pop(int num) {
		list.remove(num);
	}
	public void print() {
		System.out.print(list);
	}
	public void clear() {
		list.clear();
		System.out.println("The array list is cleared.");
	}
	public void peek() {
		System.out.println("The latest number you place on the stack was " + list.get(list.size() - 1));
	}
}
