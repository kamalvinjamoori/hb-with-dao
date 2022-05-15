package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GiveBonusToEmployeeUseCase {

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDaoImpl();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee Id");

		int id = sc.nextInt();

		System.out.println("Enter Bonus Amount");

		int bonus = sc.nextInt();
		
		String str = dao.giveBonusToEmployee(id, bonus);
		
		if(str != null)
			System.out.println(str);
		else
			System.out.println("Employee not found");
		
		sc.close();
		
	}

}
