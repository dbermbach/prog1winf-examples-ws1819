package firstpackage;

import Prog1Tools.IOTools;

/**
 * 
 */

/**
 * @author Dave
 */
public class SecondClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.print("hello\thello2\t\t\n");
		System.out.print("world\n");
		System.out.println("foo");
		int a = IOTools.readInt();
		System.out.println(a + a);
		System.out.println(a / 3);
		System.out.println(a / 3.0);
		System.out.println(a % 3);

		System.out.println(a == 3);
		System.out.println(a != 3);
		System.out.println(a < 5);
		System.out.println(a > 5);
		System.out.println(a <= 4);
		System.out.println(a >= 7);

		System.out.println((a + 3) * (4 + a) >= (a + 7) * 6);

		String str = "hello" + "world" + 3 + 4;
		System.out.println(str);
		str = "hello" + "world" + (3 + 4);
		System.out.println(str);

		System.out.println("a=" + a);
		System.out.println(3 + 4 + "TEST");

		a = a + 7;
		a += 7;
		System.out.println(true&&false);
		System.out.println(true||false);
		System.out.println(!true);

	}
}
