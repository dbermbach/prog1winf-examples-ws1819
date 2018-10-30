package firstpackage;
/**
 * 
 */

/**
 * @author Dave
 */
public class FirstClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int j;
		j = 5;
		
		System.out.println(-j);
		System.out.println(j);
		
		System.out.println(j++);
		System.out.println(j);
		
		System.out.println(++j);
		System.out.println(j);
		
		j = 123_456_789;
		
		long l = 5L;
		
		double d = 1.3;
		d = .3;
		d = 1.3e-15;

		
		char myChar = 'a';
		
		String str = "hello world sfhöheröiuhafökhasöfdh";
		System.out.println(str);
		myChar = '\'';
		str = "\"\\";
		System.out.println(str);
	}

}
