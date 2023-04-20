package com.srkit.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.srkit.dao.EmpDAO;
import com.srkit.entity.EmployeeEntity;

public class EmpDAOImpl implements EmpDAO 
{

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	
	@Override
	public List<EmployeeEntity> exeuteNamedQuery(int deptNo) 
	{
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq = em.createNamedQuery("query1", EmployeeEntity.class);
		tq.setParameter(1, deptNo);
		List<EmployeeEntity> lst = tq.getResultList();
		em.close();
		return lst;
	}

	@Override
	public List executeNamedNativeQuery(int sal) 
	{
		EntityManager em = factory.createEntityManager();
		Query q = em.createNamedQuery("query2");
		q.setParameter(1, sal);
		List lst = q.getResultList();
		em.close();
		return lst;
	}

}
