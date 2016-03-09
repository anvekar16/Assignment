package com.ashwini.add;

import java.util.List;

import com.ashwini.model.Book;

public interface Adder<E> {

	// int add(List<E> store, E b);

	int add(List<Book> store, Book b);

}
