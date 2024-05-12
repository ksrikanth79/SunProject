package com.core;

import java.util.ArrayList;
import java.util.Iterator;

public class ListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> li=new ArrayList();
li.add("Sri");
li.add("Kanth");
li.add("Ram");
li.add("Krishna");
System.out.println(li);
li.add("Siva");
li.add("Muruga");
li.add("Sri");
//Print Duplicates
System.out.println(li);
//Print Index
System.out.println(li.get(0));
System.out.println("List Size and Printing Values using For Loop"+li.size());
for(int i=0;i<li.size();i++)
{
	System.out.println(li.get(i));
}
System.out.println("Printing all List Elements");
Iterator<String> it = li.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}


}
