package com.example.MyService.myService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	
		@Autowired
		private EmployeeService empService;
			
		
		@GetMapping("/getEmployeeDetails/{id}")
		public Employee getEmployeeDetails(@PathVariable long id){
			
			return empService.getEmployeeDetails (id);
			
		}
		
		
		@GetMapping("/getAllEmployeeDetails")
		public List<Employee> getAllEmployeeDetails(){
			
			return empService.getAllEmployeeDetails();
			
		}
		
		
		@PostMapping(value="/employee/save", consumes="application/json")
		public String savePlayer(@RequestBody Employee emp){
			
			return empService.savePlayer(emp);
			
		}
		
}
