package probeklausur;

public class MultThread extends Thread {

	private int a;
	private int b;
	private int result;
	
	
	

	

	public MultThread(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		this.result = this.a * this.b;
	}
	
	public int getResult() {
		return result;
	}
	
	
	
}
