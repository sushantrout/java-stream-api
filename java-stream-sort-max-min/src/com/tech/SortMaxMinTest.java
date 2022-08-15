package com.tech;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortMaxMinTest {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();

		/* sorted() */
		employees.stream().map(e -> e.age).sorted().forEach(System.out::println);

		/* sorted(java.util.Comparator) */
		String employeeName = employees.stream().sorted(Comparator.comparing(Employee::getId).reversed())
				.map(Employee::getName).collect(Collectors.joining(","));

		System.out.println(employeeName);

		// min(java.util.Comparator)
		String min = employees.stream().min(Comparator.comparing(Employee::getId)).map(Employee::getName).orElse(null);

		System.out.println(min);

		// max(java.util.Comparator)
		String max = employees.stream().max(Comparator.comparing(Employee::getId)).map(Employee::getName).orElse(null);

		System.out.println(max);
	}
}
