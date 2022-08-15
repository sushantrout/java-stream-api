package com.tech;

import java.util.Arrays;
import java.util.List;

public class ReduceTest {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//T reduce(T identity, BinaryOperator<T> accumulator);
		int sum = Arrays.stream(numbers).reduce(0, Integer::sum); // 55
		System.out.println(sum);
		
		//Optional<T> reduce(BinaryOperator<T> accumulator);
		sum = Arrays.stream(numbers).reduce(Integer::sum).orElse(0); // 55
		System.out.println(sum);
		
		List<Employee> employees = EmployeeProvider.getEmployees();
		Integer reduce = employees.stream().reduce(0, (e, e1) -> e + e1.getAge(), Integer::sum);
		System.out.println(reduce);
	}
}
