package com.ashwini.add;

import java.util.List;

import com.ashwini.model.Book;

public class AddBook implements Adder<Object>{

	@Override
	public int add(List<Book> store, Book b) {
		// TODO Auto-generated method stub
		
		if(store.add(b)){
			System.out.println(" Success in addition");
			return 1;
		}
		
		System.out.println(" failed to add  ");
		return 0;
	}

	
}
