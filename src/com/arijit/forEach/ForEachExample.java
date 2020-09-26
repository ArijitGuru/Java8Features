package com.arijit.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
	
	public static void main(String args[]) {
		List<String> nameList = new ArrayList<>();
		
		for (int  i = 0; i < 10; i++) {
			String name = "Arijit_"+ i;
			nameList.add(name);
			
		}
		
		nameList.forEach(item -> {
			System.out.println(item);
		});
		
		
		
		
	}
	
	
}
