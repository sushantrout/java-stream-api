package com.tech;

import java.util.List;

public class ForEachAndForEachOrderTest {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();
		employees.parallelStream().map(d -> d.age).forEach(System.out::println);

		employees.parallelStream().map(d -> d.age).forEachOrdered(System.out::println);
	}
}
