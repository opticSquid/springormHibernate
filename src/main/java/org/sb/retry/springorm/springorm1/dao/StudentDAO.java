package org.sb.retry.springorm.springorm1.dao;

import javax.transaction.Transactional;

import org.sb.retry.springorm.springorm1.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDAO {
	private HibernateTemplate hibernateTemplate;

	// save student
	@Transactional
	public int insert(Student student) {
		Integer res = (Integer) this.hibernateTemplate.save(student);
		return res;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
