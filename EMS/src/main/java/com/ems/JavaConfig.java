package com.ems;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JavaConfig {
	
	@Bean
	public DriverManagerDataSource dmds() {
		DriverManagerDataSource con = new DriverManagerDataSource();
		con.setDriverClassName("com.mysql.cj.jdbc.Driver");
		//oracle.jdbc.driver.OracleDriver
		con.setUrl("jdbc:mysql://localhost:3306/ems");
		//jdbc:oracle:thin:@localhost:1521:xe
		//jdbc:oracle:thin:@//localhost:1521/db_name
		con.setUsername("root");
		con.setPassword("root");
		return con;
	}
	
	@Bean
	public JdbcTemplate jdbc() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dmds());
		return template;
	}
	
	
	@Bean
	public Scanner sc() {
		Scanner scanner = new Scanner(System.in);
		return scanner;
	}
	
	@Bean
	public EmployeeCrud emp() {
		EmployeeCrud empCrud = new EmployeeCrud();
		return empCrud;
	}
	
	@Bean
	public Main main() {
		Main m = new Main();
		return m;
	}
}







