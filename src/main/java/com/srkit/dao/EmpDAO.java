package com.srkit.dao;

import java.util.List;

import com.srkit.entity.EmployeeEntity;

public interface EmpDAO {

	List<EmployeeEntity> exeuteNamedQuery(int deptNo);
	
	List executeNamedNativeQuery(int sal);
}
