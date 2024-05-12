package com.core;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1="India";
String name2="Tamil Nadu";
String name3="Chennai";
String name4="ANNA NAGAR";
String name5="TOWER";
String name6="VR MALL";
String name7="Blue Star";
String name8="AYYAPPAN TEMPLE";
String name9="srikanth";
String name10="kumar";
String name11="  I Love My India   ";
String name12="SRIKANTH";
String name13="abc";
String name14=new String ("SRIKANTH");
System.out.println(name1.concat(name10));
System.out.println(name2.length());
System.out.println(name9.toUpperCase());
System.out.println(name5.toLowerCase());
System.out.println(name11.trim());
System.out.println(name9.equals(name12));
System.out.println(name9.equalsIgnoreCase(name12));
System.out.println(name4.toCharArray());
System.out.println(name4.charAt(3));
System.out.println(name7.replace('S','s'));
System.out.println(name13.replaceAll("abc","xyz"));
System.out.println(name5.startsWith("T"));
System.out.println(name5.endsWith("r"));
System.out.println(name9.hashCode());
System.out.println(name12.hashCode());
System.out.println(name14.hashCode());


		
	
	}

}
