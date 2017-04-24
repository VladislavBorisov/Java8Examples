package com.java8examples;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SqrtSample {

	public static boolean isPrime(int number) {
	  return number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);

	}

	public static void main(String[] args) {
		int n = 101;
		int k = 51;
		System.out.println(compute(n, k));
	}
    //find the total of sqrt of fist k primes starting with n
	public static double compute(int n, int k) {
	  return Stream.iterate(n, e -> e + 1)
				   .filter(SqrtSample::isPrime)
				   .mapToDouble(Math::sqrt)
				   .limit(k)
				   .sum();
	}
}
