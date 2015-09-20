package com.lau.collect;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ORDENACIÓ D'OBJECTES AMB COMPARABLE
 * 
 */
public class SortFruit {
	public static void main(String[] args) {
		List<Fruit> fruits = new ArrayList<Fruit>();
		// "Pineapple", "Apple", "Orange","Banana"
		Fruit pineapple = new Fruit("pineapple", "yellow");
		Fruit apple = new Fruit("apple", "yellow");
		Fruit orange = new Fruit("orange ", "orange ");
		Fruit banana = new Fruit("banana", "yellow");

		fruits.add(pineapple);
		fruits.add(apple);
		fruits.add(orange);
		fruits.add(banana);
		/**
		 * Si la classe fruit no implementa compareTo no se sabrà quin és el
		 * criteri d'ordenació ens donaria un error tipus cannot be cast to
		 * java.lang.Comparable
		 */

		Collections.sort(fruits);
		int i = 0;
		for (Fruit temp : fruits) {
			System.out.println("fruits " + ++i + " : " + temp.getName());
		}
	

	/**
	 * SORTIDA 
	 * fruits 1 : apple 
	 * fruits 2 : banana 
	 * fruits 3 : orange 
	 * fruits 4 : pineapple
	 */

	// Podem ordenar per altres atributs, per exemple alfabeticament pel color
	// Per fer això necessito un Comparator de fruites. Puc programar-ho
	// directament o en previsió
	// de què voldré reaprofitat el codi una funció em pot retornar el
	// comparator.
	// Collections.sort( List<T> list, Comparator<? suoer T>c);
	ColorComparator colorComparator = new ColorComparator();
	Collections.sort(fruits, colorComparator);
	i=0;
	for (Fruit temp : fruits) {
		System.out.println("fruits " + ++i + " : " + temp.getName());
	}
	}
}