package main;

import org.hibernate.Session;
import example.Employee;
import example.Employee1;
import util.HibernateUtil;

public class HibernateMain {

	public static void main(String[] args){
		Employee emp = new Employee();
		emp.setName("Filip Jerga");
		emp.setAddress("SNV");
		emp.setSalary(850);
		
		// Get Session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		// start transaction
		session.beginTransaction();
		// Save the Model object
		session.save(emp);
		// Commit transaction
		session.getTransaction().commit();
		System.out.println("Employee ID=" + emp.getId());

		// terminate session factory, otherwise program won't end
		HibernateUtil.getSessionFactory().close();
	}
}
