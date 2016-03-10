package com.ashwini.model;

import java.util.Comparator;
import java.util.Scanner;

public class Book {

	String name;
	String author;
	String publisher;
	Float price;

	public Book() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Give name of book ");
		this.name = in.nextLine();

		System.out.println("Give author of book");
		this.author = in.nextLine();

		System.out.println("Give publisher of book");
		this.publisher = in.nextLine();

		System.out.println("Give price of book");
		this.price = in.nextFloat();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", publisher=" + publisher + ", price=" + price + "]";
	}

	public static Comparator<Book> BookNameComparator = new Comparator<Book>() {
		public int compare(Book b1, Book b2) {

			String bookName1 = b1.name;
			String bookName2 = b2.name;

			return bookName1.compareTo(bookName2);
		}
	};

	public static Comparator<Book> BookPriceComparator = new Comparator<Book>() {
		public int compare(Book b1, Book b2) {

			Float price1 = b1.price;
			Float price2 = b2.price;

			return (int) (price1 - price2);
		}
	};
	public static Comparator<Book> BookAuthorComparator = new Comparator<Book>() {
		public int compare(Book b1, Book b2) {

			String bookAuthor1 = b1.author;
			String bookAuthor2 = b2.author;

			return bookAuthor1.compareTo(bookAuthor2);
		}
	};
	public static Comparator<Book> BookPublisherComparator = new Comparator<Book>() {
		public int compare(Book b1, Book b2) {

			String bookPublisher1 = b1.publisher;
			String bookPublisher2 = b2.publisher;

			return bookPublisher1.compareTo(bookPublisher2);
		}
	};

}
