package com.core;

public class StringConcepts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1="Srikanth";
String name2="Srikanth";
String name3=new String("Srikanth");
System.out.println(name1.hashCode());
System.out.println(name2.hashCode());
System.out.println(name3.hashCode());
System.out.println(System.identityHashCode(name1));
System.out.println(System.identityHashCode(name2));
System.out.println(System.identityHashCode(name3));
//equals to method is going to verify the content
System.out.println(name2.equals(name3));

//== operator is going to compare the address of the variables
System.out.println(name2==name3);

	}

}
