package com.ashwini.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.ashwini.add.AddBook;
import com.ashwini.add.Adder;
import com.ashwini.add.DeleteBook;
import com.ashwini.add.UpdateBook;
import com.ashwini.model.Book;

public class Manager {

	public static void display(List<Book> store) {
		System.out.println(" Books in store ");
		for (Book b1 : store) {
			System.out.println(b1);
		}
	}

	public static void main(String[] args) {
		// Manager m = new Manager();
		Menu menu = new Menu();

		List<Book> store = new ArrayList<Book>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			choice = menu.display();
			switch (choice) {

			case 1:
				Book b = new Book();

				Adder<Object> addBook = new AddBook();
				addBook.add(store, b);
				break;

			case 2:

				display(store);

				System.out.println(" Give the name of book which needs to be deleted ");

				String deleteBookName = sc.nextLine();

				DeleteBook deleteBook = new DeleteBook();
				deleteBook.delete(store, deleteBookName);

				break;

			case 3:

				display(store);

				System.out.println(" Give the name of book which needs to be updated ");

				String updateBookName = sc.nextLine();

				UpdateBook updateBook = new UpdateBook();
				updateBook.update(store, updateBookName);

				break;
			case 4:

				display(store);

				System.out.println(" Give the name of book which needs to be searched ");

				String searchBookName = sc.nextLine();

				SearchBook searchBook = new SearchBook();
				searchBook.search(store, searchBookName);

				break;
			case 5:
				System.out.println(" Sort books in store ");
				System.out.println(" Give criteria based on which books will be sorted " + "1.By name" + "2.By price"
						+ "3.By author" + "4.By publisher");

				int inputOption;
				Scanner in = new Scanner(System.in);
				inputOption = in.nextInt();

				switch (inputOption) {
				case 1:
					Collections.sort(store, Book.BookNameComparator);
					display(store);
					break;
				case 2:
					Collections.sort(store, Book.BookPriceComparator);
					display(store);
					break;
				case 3:
					Collections.sort(store, Book.BookAuthorComparator);
					display(store);
					break;
				case 4:
					Collections.sort(store, Book.BookPublisherComparator);
					display(store);
					break;
				default:
					System.out.println(" Give the input between 1 to 4 ");
					break;
				}
				break;
			default:
				System.out.println(" Give the input between 1 to 6 ");
				break;
			}

		} while (choice != 6);

	}

}
