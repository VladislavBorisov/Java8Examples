package com.java8examples;

import java.util.Arrays;
import java.util.List;

class ForEachList {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		numbers.forEach(System.out::println); // method reference
		numbers.forEach(e -> System.out.println(e));
	}
}