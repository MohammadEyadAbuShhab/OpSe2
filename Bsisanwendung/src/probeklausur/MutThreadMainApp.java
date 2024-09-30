package probeklausur;

public class MutThreadMainApp {

	public static void main(String[] args) {
		
		int [] a = {1,2,3};
		int [] b = {4,5,6};
		
		MultThread [] threadObj = new MultThread [3];
		
		for (int i = 0; i < threadObj.length; i++) {
			threadObj[i] = new MultThread(a [i], b[i]);
			threadObj[i].start();
			try {
				threadObj[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int summe = 0;
		for (int i = 0; i < threadObj.length; i++) {
			summe += threadObj[i].getResult();
		}
		System.out.println(summe);
		
	

	}

}
