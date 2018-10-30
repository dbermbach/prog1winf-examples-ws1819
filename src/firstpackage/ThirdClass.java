/**
 * 
 */
package firstpackage;

/**
 * @author Dave
 */
public class ThirdClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 4;
		if (a == 3) {
			System.out.println("ist drei");
		} else {
			System.out.println("ist nicht drei");
		}

		if (a == 3) {
			System.out.println("ist drei");
		} else if (a < 3) {
			System.out.println("ist kleiner drei");
		} else
			System.out.println("ist groesser drei");

		int b = 3;

		switch (b) {
		case 0:
			System.out.println("ist 0");
		case 1:
			System.out.println("ist 1");
		case 2:
			System.out.println("ist 2");
			break;
		case 3:
			System.out.println("ist 3");
		default:
			System.out.println("ist was Anderes");
		}

		char c = 'a';
		switch (c) {
		case 'a':
			System.out.println("a");
			break;
		default:
			System.out.println("was Anderes");
		}

		int[] ar;
		ar = new int[4];
		ar[0] = 123;
		ar[2] = 42;
		ar[3] = ar[0]+ar[2];
		ar[1] = -1;
		ar[0] = 5;
		ar[3] = ar[0]+ar[2];
		
		System.out.println(ar);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		ar = null;
		
		int [][] ar2 = new int [1][1];
		
		ar2[0][0] = 5;
	}

}
