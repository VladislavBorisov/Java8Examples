package com.java8examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sapmle {

	private static int totalValues(List<Integer> values, Predicate<Integer> selector) {
//		imperative style
//		int result = 0;
//		for (int e : values) {
//			if (selector.test(e)) {
//				result += e;
//			}
//		}
//		return result;
		
//		functional style
		return values.stream()
				     .filter(selector)
				     .reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(totalValues(numbers, e -> true));
		System.out.println(totalValues(numbers, e -> e % 2 == 0));
		System.out.println(totalValues(numbers, e -> e % 2 != 0));
	}

}
