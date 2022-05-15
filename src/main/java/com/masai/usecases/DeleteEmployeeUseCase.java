package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class DeleteEmployeeUseCase {

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDaoImpl();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee Id");
		
		int id = sc.nextInt();
		
		boolean f = dao.deleteEmployee(id);
		
		if(f)
			System.out.println("Employee deleted successfully");
		else
			System.out.println("Employee not found");
		
		sc.close();
	}

}
