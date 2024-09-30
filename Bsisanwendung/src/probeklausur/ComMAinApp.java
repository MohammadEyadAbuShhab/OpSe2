package probeklausur;

import java.util.Stack;

public class ComMAinApp {

	public static void main(String[] args) {
		
		Stack<Integer> liste1 = new Stack<>();
		Stack<Integer> liste2 = new Stack<>();
		
		for (int i = 1; i < 8; i+=2) {
			liste1.push(i);
		}
		for (int i = 2; i <= 8; i+=2) {
			liste2.push(i);
		}
		
		CombinedIntegerStack c1  =new CombinedIntegerStack(liste1, liste2);
		Stack<Integer>  liste3  = c1.getCombinedStack();
		
//		while(!liste3.isEmpty()) {
//			System.out.println(liste3.pop());
//		}
		
		for (int i = liste3.size()-1; i >= 0 ; i--) {
			System.out.println(liste3.pop());
		}
	}
}
