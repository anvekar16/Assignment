package com.ashwini.add;

import java.util.List;

import com.ashwini.model.Book;

public class UpdateBook {

	public int update(List<Book> store, String updateBookName) {
		// TODO Auto-generated method stub
		for (Book b1 : store) {
			if (b1.name.contains(updateBookName)) {
				Book b2 = new Book();
				AddBook addBook = new AddBook();
				addBook.add(store, b2);
				store.remove(b1);
				System.out.println(" Success in updation");
				return 1;
			}
		}
		System.out.println(" failed to update ");
		return 0;
	}
}
