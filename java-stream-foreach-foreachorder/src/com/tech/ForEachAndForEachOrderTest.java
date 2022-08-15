package com.tech;

import java.util.List;

public class ForEachAndForEachOrderTest {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();
		
		/* forEach(Consumer<? super Integer> action) */
		employees.parallelStream().map(d -> d.age).forEach(System.out::println);

		/* forEachOrdered(Consumer<? super Integer> action) */
		employees.parallelStream().map(d -> d.age).forEachOrdered(System.out::println);
	}
}
