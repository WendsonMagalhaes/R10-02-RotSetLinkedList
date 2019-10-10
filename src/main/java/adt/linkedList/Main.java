package adt.linkedList;

import java.util.Arrays;

import adt.linkedList.set.SetLinkedListImpl;

public class Main {

	public static void main(String[] args) {
		SetLinkedListImpl<Integer> lista = new SetLinkedListImpl<Integer> ();
		SetLinkedListImpl<Integer> lista2 = new SetLinkedListImpl<Integer> ();
		
		lista.insert(1);
		lista.insert(2);
		lista.insert(1);
		lista.insert(3);
		lista.insert(1);
		lista.insert(4);
		
		lista2.insert(1);
		lista2.insert(2);
		lista2.insert(1);
		lista2.insert(3);
		lista2.insert(2);
		lista2.insert(4);
		
		System.out.println(Arrays.toString(lista2.toArray()));
		lista2.removeDuplicates();
		System.out.println(Arrays.toString(lista2.toArray()));
		System.out.println(lista.size());

	}

}
