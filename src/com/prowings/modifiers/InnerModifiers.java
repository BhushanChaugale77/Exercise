package com.prowings.modifiers;

public class InnerModifiers {
	
	 public static void main(String[] args) {
		
		 System.out.println("if outer class is static then inner class must static");
		 
		 System.out.println("public + final + static + strictfp  is allowed");
		 
		 System.out.println("<default> + final + static + strictfp  is allowed" );
		 
		 System.out.println("protected + final + static + strictfp  is allowed");
		 
		 System.out.println("private + final + static + strictfp  is allowed");
		 
		 System.out.println("abstract + final is not allowed");
		 
		 
		 
	}
	
	
	 public final static strictfp  class InsideInner{
		 
		 public static void main(String[] args) {
			
			 System.out.println("Inside Inner");
		}
		
	 }
	
	

}
