package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GetAddressOfEmployeeUseCase {
	
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee Id");
		
		int id = sc.nextInt();
		
		String str = dao.getAddressOfEmployee(id);
		
		if(str != null) {
			System.out.println(str);
		}
		else
			System.out.println("Emploee not found");
		
		sc.close();
	}
}
