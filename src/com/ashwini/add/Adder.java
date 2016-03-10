package com.ashwini.add;

import java.util.List;

public interface Adder<E> {

	// int add(List<E> store, E b);

	<T> int add(List<T> store, T b);

}
