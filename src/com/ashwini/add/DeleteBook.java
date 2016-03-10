package com.ashwini.add;

import java.util.List;

import com.ashwini.model.Book;

public class DeleteBook {

	public <T> int delete(List<T> store, String deleteBookName) {
		String name;
		for (T b1 : store) {
			name = ((Book) b1).getName();
			if (name.contains(deleteBookName)) {
				store.remove(b1);
				System.out.println(" Success in deletion");
				return 1;
			}
		}
		System.out.println(" failed to delete");
		return 0;
	}
}
