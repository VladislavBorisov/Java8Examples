package com.java8examples;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
	
	public static IntStream reverseOrderStream(IntStream intStream) {
		int[] tempArray = intStream.toArray();
		return IntStream.range(1, tempArray.length + 1)
				        .boxed()
				        .mapToInt(i -> tempArray[tempArray.length - i]);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
		reverseOrderStream(IntStream.of(arr)).forEach(result -> System.out.print(result + " "));
	}
}