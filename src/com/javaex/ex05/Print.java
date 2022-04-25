package com.javaex.ex05;

public class Print {

	
	 public void printer(int val){
	        
		 System.out.println(val);
    }

	 public void printer(boolean val) {
		 if(val == true) {
			 System.out.println(val);
		 }
		 else {
			 System.out.println(false);
		 }
	 }
	 
	 public void printer(double val) {
		 System.out.println(val);
	 }
	 
	 public void printer(String val) {
		 System.out.println(val);
	 }
	    
}
