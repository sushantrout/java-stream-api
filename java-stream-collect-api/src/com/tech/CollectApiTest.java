package com.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectApiTest {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();
		long count = employees.stream().map(Employee::getAge).distinct().count();
		System.out.println("Size : " + count);

		/* peek(java.util.function.Consumer) */
		long peekCount = employees.stream().map(e -> e.age).peek(System.out::println).filter(e -> e < 100).peek((e) -> {
			System.out.println("FilterValue = " + e);
		}).count();

		System.out.println(peekCount);

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		/* limit(long) */
		System.out.println("Limit");
		asList.stream().limit(2).forEach(System.out::println);

		/* skip(long) */
		System.out.println("Skip");
		asList.stream().skip(2).forEach(System.out::println);

		/* count() */
		long countMethod = asList.stream().count();
		System.out.println(countMethod);
		
		/*
		 * collect(Supplier<Object> supplier, BiConsumer<Object, ? super Employee>
		 * accumulator, BiConsumer<Object, Object> combiner)
		 */
		ArrayList<Object> employeesAfterCollect = employees.stream().collect(ArrayList::new, (e1, e2) -> e1.add(e2), (e1, e2) -> e1.add(e2));
		System.out.println(employeesAfterCollect);
		
		/* collect(Collector<? super Employee, Object, List<Employee>> collector) */
		List<Employee> collect = employees.stream().collect(Collectors.toList());
		System.out.println(collect);
		
	}
}
