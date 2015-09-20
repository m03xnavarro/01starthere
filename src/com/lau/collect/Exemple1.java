package com.lau.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exemple1 {
 public static void main(String[] args) {
	/**
	 * Declarar una llista
	 */
	 List<String>  strList = new ArrayList<String>();
	 
	 /**
	  * Afegir elements 
	  */
	 strList.add("frase1");
	 strList.add("frase2");
	 strList.add("frase3");
	 
	 /**
	  * Afegir elements per posició
	  */
	 strList.add(0, "frase0");
	
	 /**
	  * Saber si existeix l'element
	  */
	 boolean existeix = strList.contains("frase0");
	 System.out.println(String.valueOf(existeix));
	 
	 
	 /**
	  * Recórrer la llista
	  */
	 /**
	  * VERSIÓ1
	  */
	 for (String element:strList){
		 	System.out.println(element);
	 }
	 
	 /**
	  * VERSIÓ2
	  */
	 for(int i =0;i<strList.size();i++){
		 System.out.println(strList.get(i));
	 }
	 /**
	  * VERSIÓ3
	  */
	 Iterator<String> it = strList.iterator();
	 while(it.hasNext()){
		 System.out.println(it.next());
	 }
	 
}
 
}