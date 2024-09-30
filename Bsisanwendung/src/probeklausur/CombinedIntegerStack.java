package probeklausur;

import java.util.Stack;

public class CombinedIntegerStack {

	private Stack<Integer> liste1;
	private Stack<Integer> liste2;
	
	
	public CombinedIntegerStack(Stack<Integer> liste1, Stack<Integer> liste2) {
		super();
		this.liste1 = liste1;
		this.liste2 = liste2;
	}
	public Stack<Integer> getCombinedStack(){
		Stack<Integer> liste3 = new Stack<>();
		if(!(liste1.size() == liste2.size())) {
			System.out.println("Die Stacks sind nicht gleich groß");
			return liste3;
		}
			int tempSize = liste1.size();
			for (int i = 0; i < tempSize; i++) {
				liste3.push(liste2.pop());
				liste3.push(liste1.pop());
			}
		return liste3;
	}

	public Stack<Integer> getListe1() {
		return liste1;
	}

	public void setListe1(Stack<Integer> liste1) {
		this.liste1 = liste1;
	}

	public Stack<Integer> getListe2() {
		return liste2;
	}

	public void setListe2(Stack<Integer> liste2) {
		this.liste2 = liste2;
	}
	
	
	
 }
