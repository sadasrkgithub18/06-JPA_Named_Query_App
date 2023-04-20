package com.srkit.test;

import java.util.List;

import com.srkit.dao.EmpDAO;
import com.srkit.dao.impl.EmpDAOImpl;
import com.srkit.entity.EmployeeEntity;

public class Tester {

	public static void main(String[] args) {

		EmpDAO dao = new EmpDAOImpl();
		
		List<EmployeeEntity> lst = dao.exeuteNamedQuery(30);
		lst.forEach(System.out::println);
		
		System.out.println("============================================================");
		
		List lst1 = dao.executeNamedNativeQuery(2000);
		lst1.forEach(System.out::println);
	}

}
