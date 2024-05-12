package com.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class MapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap map=new HashMap();
map.put("1", "Sri");
map.put("2", "Rama");
map.put("3", "Krishna");
map.put("4", "Govinda");
map.put("5", "Murali");
map.put("6", "Hari");
if(!map.isEmpty())
{
	Iterator it=map.entrySet().iterator();
	while(it.hasNext())
			{
		Map.Entry obj=(Entry)it.next();
		System.out.println(obj.getKey()+"*************************"+obj.getValue());
		
			}
			}


	}

}
