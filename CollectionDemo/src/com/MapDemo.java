package com;
import java.util.Set;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put(1, "coffee");
		map.put(2, "tea");
		map.put(3, "black coffe");
		map.put(4, "espresso");
		Set entries=map.entrySet();
		System.out.println(entries);
		String str=(String)map.get(1);
		System.out.println(str);
		Set keys=map.keySet();
		System.out.println(keys);
		Collection values =map.values();
		System.out.println(values);

	}

}
