package com;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class CollectionApp {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		if(list.isEmpty())
		{
			System.out.println("empty");
		}
		list.add(11);
		list.add(15);
		list.add(16);
		list.add(11);
		list.remove(2);
		Iterator iterator=list.iterator();
		while(iterator.hasNext());
		{
			//int i=(Integer)iterator.next();
			System.out.println(iterator.next()+" ");
		}
		System.out.println();
		/*while(iterator.hasPrevious())
		{
			System.out.println(iterator.previous()+" ");
		}
		Set set=new HashSet();
		set.add("a");
		set.add("b");
		set.add("c");
		for (Object s:set)
		{
			String str=(String) s;
			System.out.println(str);
		}*/
		

	}

}
