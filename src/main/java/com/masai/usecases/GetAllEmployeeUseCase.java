package com.masai.usecases;

import java.util.List;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.model.Employee;

public class GetAllEmployeeUseCase {

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDaoImpl();

		List<Employee> list = dao.getAllEmployee();

		list.forEach(e -> {
			System.out.println(e);
		});

	}

}
