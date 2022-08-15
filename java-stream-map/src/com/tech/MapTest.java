package com.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees();
		
		//map(java.util.function.Function)
		//mapToInt(java.util.function.ToIntFunction)
		//mapToLong(java.util.function.ToLongFunction)
		//mapToDouble(java.util.function.ToDoubleFunction)
		//System.out.println("Map");
		employees.stream().map(e -> e.getName()).forEach(System.out::println);

		System.out.println("================================>Flatmap<============================");
		//Prepare data for flatMap
		Map<String, Map<String, List<Employee>>> employeeByDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender)));

		List<List<Employee>> mapedEmployees = new ArrayList<List<Employee>>();
		for (String department : employeeByDepartment.keySet()) {
			Map<String, List<Employee>> employeeByGender = employeeByDepartment.get(department);
			for (String gender : employeeByGender.keySet()) {
				List<Employee> list = employeeByGender.get(gender);
				mapedEmployees.add(list);
			}
		}
		
		mapedEmployees.stream().flatMap(d -> d.stream()).map(d -> d.getName()).distinct().forEach(System.out::println);
	}
}
