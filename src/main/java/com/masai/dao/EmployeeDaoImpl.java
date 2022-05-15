package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.model.Employee;
import com.masai.util.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllEmployee() {

		List<Employee> emps = null;

		EntityManager em = EMUtil.provideEntityManager();

		String jpql = "from Employee";

		TypedQuery<Employee> tq = em.createQuery(jpql, Employee.class);

		emps = tq.getResultList();

		em.close();

		return emps;
	}

	@Override
	public String getAddressOfEmployee(int empId) {

		String str = null;

		EntityManager em = EMUtil.provideEntityManager();

		Employee emp = em.find(Employee.class, empId);

		if (emp != null) {

			str = emp.getAddress();

		}

		em.close();
		return str;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {

		String str = null;

		EntityManager em = EMUtil.provideEntityManager();

		Employee emp = em.find(Employee.class, empId);

		if (emp != null) {

			em.getTransaction().begin();

			emp.setSalary(emp.getSalary() + bonus);
			str = "Updated bonus " + bonus;

			em.getTransaction().commit();
		}
		em.close();

		return str;
	}

	@Override
	public boolean deleteEmployee(int empId) {

		boolean flag = false;

		EntityManager em = EMUtil.provideEntityManager();

		Employee emp = em.find(Employee.class, empId);

		if (emp != null) {

			em.getTransaction().begin();

			em.remove(emp);
			flag = true;

			em.getTransaction().commit();
		}
		
		em.close();
		return flag;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		String[] str = new String[2];

		EntityManager em = EMUtil.provideEntityManager();

		Employee emp = em.find(Employee.class, empId);

		if (emp != null) {

			em.getTransaction().begin();

			str[0] = emp.getName();
			str[1] = emp.getAddress();

			em.getTransaction().commit();
		}
		em.close();
		return str;
	}

}
