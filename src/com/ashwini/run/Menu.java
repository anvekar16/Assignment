package com.ashwini.run;

import java.util.Scanner;

public class Menu {

	public int display() {
		System.out.println(" Book Store \n " + "1.Add book to the store \n" + "2.Delete books from the store \n"
				+ "3.Update existing record of book \n" + "4.Search book record \n" + "5.Sort book records \n"
				+ "6.Exit \n" + "Give option to perform action \n");

		int inputOption;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		inputOption = in.nextInt();

		return inputOption;

	}

}
