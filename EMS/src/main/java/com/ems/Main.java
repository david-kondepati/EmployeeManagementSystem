package com.ems;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class Main {
	@Autowired
	private Scanner sc;
	@Autowired
	private EmployeeCrud empCrud;
	
	public void crud() {
		boolean flag = true;
    	while(flag) {
    		
    		System.out.println("Welcome Admin!");
    		System.out.println("1: Add a new Employee");
    		System.out.println("2: Edit an existing employee");
    		System.out.println("3: Delete an employee by Id");
    		System.out.println("4: Check all employee");
    		System.out.println("5: Logout");
    		
    		int choice = sc.nextInt();
    		
    		switch(choice) {
    			case 1: empCrud.addEmp();
    			break;
    			
    			case 2: empCrud.editEmp();
    			break;
    			
    			case 3: empCrud.deleteEmpById();
    			break;
    			
    			case 4: empCrud.watchAllEmp();
    			break;
    			
    			case 5: System.out.println("Thank you admin! You are logged out now"); 
    			flag=false;
    			break;
    			
    			default: System.out.println("Wrong input");
    		}
    		
    	}
    	
	}
}
