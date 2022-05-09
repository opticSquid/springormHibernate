package org.sb.retry.springorm.springorm1.dao;

import org.sb.retry.springorm.springorm1.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDAO {
	private HibernateTemplate hibernateTemplate;

	// save student
	public int insert(Student student) {
		Integer res = (Integer) this.hibernateTemplate.save(student);
		return res;
	}
}
