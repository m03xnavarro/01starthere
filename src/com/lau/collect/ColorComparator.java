package com.lau.collect;

import java.util.Comparator;

public class ColorComparator implements Comparator<Fruit> {
	public int compare(Fruit f1, Fruit f2) {
		return f1.getColor().compareTo(f2.getColor());
	}
}