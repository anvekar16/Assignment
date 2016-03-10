package com.ashwini.run;

import java.util.List;

import com.ashwini.model.Book;

public class SearchBook {

	public int search(List<Book> store, String searchBookName) {
		// TODO Auto-generated method stub
		String name;
		for (Book b1 : store) {
			name = b1.getName();
			if (name.contains(searchBookName)) {
				System.out.println(b1);
				System.out.println(" Success in searching");
				return 1;
			}
		}
		System.out.println(" failed to search could not find data ");
		return 0;
	}
}
