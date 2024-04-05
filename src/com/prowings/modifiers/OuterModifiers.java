package com.prowings.modifiers;

 public final  class OuterModifiers {
	
	
	// public
	// <default>
	// final
	// abstract
	// strictfp

	  public static void main(String[] args) {
		
		  System.out.println("public + strictfp + abstract is allowed");
		  
		  System.out.println("<default> + strictfp + abstract is allowed");
		  
		  System.out.println("<default> + final + strictfp + abstract is not allowed"); // Unresolved compilation problem: at com.prowings.modifiers.OuterModifiers.main(OuterModifiers.java:12)

	      System.out.println("public + final + strictfp + abstract is not allowed"); // Unresolved compilation problem: at com.prowings.modifiers.OuterModifiers.main(OuterModifiers.java:12)
	  
	      System.out.println("public + final is allowed");
	      
	      System.out.println("<default> + final is allowed");
	  }
 
}
