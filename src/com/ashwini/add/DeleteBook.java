package com.ashwini.add;

import java.util.List;

import com.ashwini.model.Book;

public class DeleteBook {

	public int delete(List<Book> store, String deleteBookName) {
		for (Book b1 : store) {
			if (b1.name.contains(deleteBookName)) {
				store.remove(b1);
				System.out.println(" Success in deletion");
				return 1;
			}
		}
		System.out.println(" failed to delete");
		return 0;
	}
}
