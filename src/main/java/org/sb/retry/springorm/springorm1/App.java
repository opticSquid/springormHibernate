package org.sb.retry.springorm.springorm1;

import org.sb.retry.springorm.springorm1.dao.StudentDAO;

import org.sb.retry.springorm.springorm1.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("org/sb/retry/springorm/springorm1/Config.xml");
		StudentDAO studentdao = ctx.getBean("studentDao", StudentDAO.class);
		Student student = new Student(731, "Soumalya Bhattacharya", "Arambagh");
		int r = studentdao.insert(student);
		System.out.println("response= " + r);
	}
}
