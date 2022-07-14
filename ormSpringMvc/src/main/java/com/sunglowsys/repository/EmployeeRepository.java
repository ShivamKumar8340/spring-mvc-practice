package com.sunglowsys.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sunglowsys.domain.Employee;

@Repository
public class EmployeeRepository {
	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveEmployee(Employee employee) {
		
		int id = (Integer)this.hibernateTemplate.save(employee);
		return id;
	}

}
