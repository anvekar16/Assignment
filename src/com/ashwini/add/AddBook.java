package com.ashwini.add;

import java.util.List;

public class AddBook implements Adder<Object>{

	
	@Override
	public <T> int add(List<T> store, T b) {
		// TODO Auto-generated method stub
		if(store.add(b)){
			System.out.println(" Success in addition ");
			return 1;
		}
		
		System.out.println(" failed to add  ");
		return 0;
		
	}

	
}
