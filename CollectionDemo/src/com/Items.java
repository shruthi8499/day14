package com;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
public class Items {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("coffee");
		list.add("latte");
		list.add("reg tea");
		list.add("espresso");
		list.add("black coffee");
		list.add("capaccuino");
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next()+" ");
		}
		System.out.println("remove: "+list.remove(4));
		System.out.println("get: "+list.get(3));

	}

}
