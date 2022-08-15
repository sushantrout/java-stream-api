package com.tech;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FilterTest {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();
		
		//filter(java.util.function.Predicate);
		Predicate<? super Employee> idLessThan150P = p -> p.id < 150;
		employees.stream().filter(idLessThan150P).forEach(System.out::println);
		
		//Terminate Methods
		
		//allMatch(Predicate);
		boolean allMatch = employees.stream().allMatch(idLessThan150P);
		System.out.println("allMatch " +allMatch);
		
		//noneMatch(java.util.function.Predicate);
		boolean noneMatch = employees.stream().noneMatch(idLessThan150P);
		System.out.println("noneMatch " +noneMatch);
		
		//anyMatch(Predicate);
		boolean anyMatch = employees.stream().anyMatch(idLessThan150P);
		System.out.println("anyMatch " +anyMatch);
		
		String findFirstName = employees.stream().filter(idLessThan150P).findFirst().map(d -> d.name).orElse(null);
		System.out.println("findFirst " + findFirstName);

		Employee findAny = employees.stream().filter(idLessThan150P).findAny().orElse(null);
		System.out.println("findAny "+findAny);
		
	}
}
