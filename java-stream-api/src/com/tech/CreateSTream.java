package com.tech;

import java.util.List;
import java.util.stream.Stream;

public class CreateSTream {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();
		Stream<String> emptyStream = Stream.empty();

		/* static <T> Stream<T> of(T... values); */
		Stream<Integer> numberSTream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		numberSTream.forEach(System.out::println);
		
		Stream<Employee> stream = employees.stream();
		stream.forEach(System.out::println);
	}
}
