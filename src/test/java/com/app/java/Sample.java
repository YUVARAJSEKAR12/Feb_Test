package com.app.java;

import java.util.Arrays;

public class Sample {
	
	public static void main(String[] args) {
		int a []= {1,1,2,2};
		
	//	Integer[] array = Arrays.stream(a).distinct().toArray(Integer[]:: new);
	//	System.out.println(Arrays.toString(array));
		int b []= new int [a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
		
		String s = "Welcome to Java";
		String replace = s.replace("W", "w").replace("e", "E");
		System.out.println(replace);
		String rep = s.replaceAll("[Wco]", "Y");
		System.out.println(rep);
	}

}
