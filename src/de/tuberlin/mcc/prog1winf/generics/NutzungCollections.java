/**
 * 
 */
package de.tuberlin.mcc.prog1winf.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dave
 *
 */
public class NutzungCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Number> list = new ArrayList<Number>();
		list.add(3);
		list.add(5);
		list.add(4);
		Map<String, Integer> myMap = new HashMap<>();
		printList(list);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(7);
		list2.add(8);
		list2.add(9);
		printList(list2); //funktioniert nur bei Verwendung von Wildcard beim printList-Parameter
		Paar<Number> paar = new Paar<>();
		paar.a = 123;
		paar.b = 456;
//		paar.a = "hello"; // Compilerfehler
//		ZahlenPaar<String> paarString = new ZahlenPaar<>(); //Compilerfehler
	}

	public static void printList(List<? extends Number> list) {
		for (Number n : list)
			System.out.println(n);
	}

}

class Paar<T>{
	public T a; //speichert beliebige Paare
	public T b;
}

class ZahlenPaar<T extends Number> {
	public T a; //speichert beliebige Paare, die aber Number oder Kindklasse von Number sein müssen
	public T b;
}

class ZweitesZahlenPaar<T extends Number> extends Paar<T>{
	//macht das gleiche wie ZahlenPaar, nutzt aber Vererbung aus
}