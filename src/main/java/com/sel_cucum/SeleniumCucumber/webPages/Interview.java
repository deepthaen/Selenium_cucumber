package com.sel_cucum.SeleniumCucumber.webPages;

import java.util.HashSet;
import java.util.Set;

public class Interview {
 
	public static void main(String[] args) {
		String str= "management";
        repeat(str);
		
	}
	
	public static String repeat(String s) {
		
		
		Set<Character> unique = new HashSet<Character>();
		Set<Character> duplicate = new HashSet<Character>();
		for(char c : s.toCharArray()) {
			if(!duplicate.contains(c)) {
				if(!unique.add(c)) {
					unique.remove(c);
					duplicate.add(c);
				}
			}
		}
		
	
		System.out.println(unique);
		
		return null;
		
			
		}
	
}
		

			
			
		
		
		
		
		
		
		
	
	
	 
		            
		            
		


