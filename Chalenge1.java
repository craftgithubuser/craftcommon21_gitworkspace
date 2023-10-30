package Quiz1;


public class Chalenge1 {

	public static void main(String[] args) {
		int[] X = { 106, 26, 81, 5, 15 };
	 
//		for (int i = 0; i < X.length; i++) {
//			System.out.println(X[i]);
//	}

////	//this will do the assending and dcending 
int temp;
		for (int i = 0; i < X.length; i++) {
			for (int j = i; j < X.length; j++) {
				if (X[i] > X[j]) {
					temp = X[i];
					X[i] = X[j];
					X[j] = temp;
				}
			}
		}
		for (int a : X) {
			System.out.println(a);
		}
	}
}
