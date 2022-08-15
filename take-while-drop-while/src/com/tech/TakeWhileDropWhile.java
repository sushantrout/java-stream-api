package com.tech;

import java.util.stream.Stream;

public class TakeWhileDropWhile {
	public static void main(String[] args) {

		System.out.println("takeWhile");
		Stream<Integer> takeWhileStream = Stream.iterate(1, e -> e + 1).limit(10);
		
		//takeWhile(java.util.function.Predicate)
		takeWhileStream.takeWhile(e -> e < 5).forEach(System.out::println);
		
		System.out.println();
		System.out.println("dropWhile");
		Stream<Integer> dropWhileSTream = Stream.iterate(1, e -> e + 1).limit(10);
		
		
		//dropWhile(java.util.function.Predicate)
		dropWhileSTream.dropWhile(e -> e < 5).forEach(System.out::println);
	}
}
