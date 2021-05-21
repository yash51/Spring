package com.example.MyService.myService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	List<Employee> employees = new ArrayList<>();

	public EmployeeService() {
		super();
		Employee emp1 = new Employee(12l, "abc", "adf", 2000l);
		Employee emp2 = new Employee(13l, "abc", "adf", 2000l);
		Employee emp3 = new Employee(14l, "abc", "adf", 2000l);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
	}

	public Employee getEmployeeDetails(long id) {

		for (Employee emp : employees) {
			if (emp.getId() == id) {
				return emp;
			}

		}
		return null;

	}

	public List<Employee> getAllEmployeeDetails() {

		return employees;
	}

	public String savePlayer(Employee emp) {
		// TODO Auto-generated method stub
		if (employees.add(emp))
			return "Sucess";
		return "Fail";
	}

}
