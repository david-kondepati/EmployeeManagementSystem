package com.ems;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeCrud {
	
	@Autowired
	private Scanner sc;
	
	@Autowired
	private JdbcTemplate template;
	
	public void addEmp() {
		sc.nextLine();
		System.out.println("Enter the Employee Id");
		String id = sc.nextLine();
		
		System.out.println("Enter the Employee Name");
		String name = sc.nextLine();
		
		System.out.println("Enter the Employee's Department");
		String dept = sc.nextLine();
		
		System.out.println("Enter the Employee's Salary");
		int salary = sc.nextInt();
		
		String query = "insert into emp values(?,?,?,?)";
		
		template.update(query,id,name,dept,salary);
		System.out.println("Employee has been added successfully");
	}
	
	public void deleteEmpById() {
		sc.nextLine();
		System.out.println("Enter the Id of Employee that you want to delete");
		String id = sc.nextLine();
		
		String query = "delete from emp where id = ?";
		template.update(query,id);
		System.out.println("Employee has been deleted Successfully");
	}
	
	public void editEmp() {
		sc.nextLine();
		System.out.println("Enter the Id of employee that you want to edit");
		String id = sc.nextLine();
		
		System.out.println("What do you want to edit");
		System.out.println("1: Name");
		System.out.println("2: Department");
		System.out.println("3: Salary");
		int choice = sc.nextInt();
		sc.nextLine();
		
		if(choice==1) {
			System.out.println("Enter the new name of Employee");
			String name = sc.nextLine();
			String query = "update emp set name=? where id=?";
			template.update(query,name,id);
			System.out.println("Name has been updated successfully");
		}
		else if(choice==2) {
			System.out.println("Enter the new department of Employee");
			String dept = sc.nextLine();
			String query = "update emp set dept=? where id=?";
			template.update(query,dept,id);
			System.out.println("Department has been updated successfully");
		}
		
		else if(choice==3) {
			System.out.println("Enter the new Salary of Employee");
			int salary = sc.nextInt();
			sc.nextLine();
			String query = "update emp set salary=? where id=?";
			template.update(query,salary,id);
			System.out.println("Salary has been updated successfully");
		}
		
	}
	
	public void watchAllEmp() {
		
	}
}
