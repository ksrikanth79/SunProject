package com.core;

import java.util.HashSet;
import java.util.Iterator;

public class SetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> li=new HashSet<String>();
li.add("Sri");
li.add("Kanth");
li.add("Ram");
li.add("Krishna");
System.out.println(li);
li.add("Siva");
li.add("Muruga");
li.add("Sri");
System.out.println(li);
Iterator<String> it=li.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
	
}
	}

}
