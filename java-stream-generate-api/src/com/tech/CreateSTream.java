package com.tech;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class CreateSTream {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();
		
		//empty
		Stream<String> emptyStream = Stream.empty();

		System.out.println(emptyStream);

		/* static <T> Stream<T> of(T... values); */
		Stream<Integer> numberSTream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		numberSTream.forEach(System.out::println);

		//.stream()
		Stream<Employee> stream = employees.stream();
		stream.forEach(System.out::println);

		//Stream.builder()
		Builder<String> builder = Stream.<String>builder();
		Stream<String> build = builder.add("A").add("B").add("C").build();
		build.forEach(System.out::println);

		//iterate(Integer seed, UnaryOperator<Integer> f)
		Stream<Integer> infiniteEvenNumbers = Stream.iterate(0, n -> n + 2).limit(10);
		infiniteEvenNumbers.forEach(System.out::println);

		Random rand = new Random();

		//generate(Supplier<? extends Integer> s)
		Stream<Integer> generateStream = Stream.generate(() -> rand.nextInt(100)).limit(20);
		generateStream.forEach(System.out::println);
		
		//concat(Stream<? extends Integer> a, Stream<? extends Integer> b)
		Stream<Integer> firstStream = Stream.iterate(0, n -> n + 2).limit(10);
		Stream<Integer> secondStream = Stream.iterate(0, n -> n + 2).limit(10);
		Stream.concat(firstStream, secondStream);
	}
}
