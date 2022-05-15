package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GetNameAndAddressUseCase {
	
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee Id");
		
		int id = sc.nextInt();
		
		String[] str = dao.getNameAndAddress(id);
		
		if(str[0] != null) {
			System.out.println("Name : "+str[0]);
			System.out.println("Address : "+str[1]);
		}
		else
			System.out.println("Employee not found");
		
		sc.close();
	}

}
