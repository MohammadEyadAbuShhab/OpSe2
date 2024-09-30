package probeklausur;

import java.util.Stack;

public class test {

	public static void main(String[] args) {
		Stack<Integer> liste1 = new Stack<>();
		Stack<Integer> liste2 = new Stack<>();
		Stack<Integer> liste3 = new Stack<>();
		
		for (int i = 1; i < 8; i+=2) {
			liste1.add(i);
		}
		for (int i = 2; i <= 8; i+=2) {
			liste2.add(i);
			
		}
		if(!(liste1.size() == liste2.size())) {
			System.out.println("Die Stacks sind nicht gleich groß");
		}else {
			int tempSize = liste1.size();
			for (int i = 0; i < tempSize; i++) {
				liste3.push(liste2.pop());
				liste3.push(liste1.pop());
			}
		}
		for (Integer integer : liste3) {
			System.out.println(integer);
		}
		

	}

}
