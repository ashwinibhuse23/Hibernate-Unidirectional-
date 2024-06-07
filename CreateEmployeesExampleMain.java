package one_to_one.unidirectional.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import one_to_one.unidirectional.entity.Employee;
import utils.HibernateUtils;

public class CreateEmployeesExampleMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory=HibernateUtils.getSessionFactory();
				Session sessionRef=factory.openSession();
				
				){
			Employee e1=new Employee(123,"Dinesh Vaidya",5000,null);
			Employee e2=new Employee(456,"Shweta Joshi",4500,null);
			
			Transaction tx= sessionRef.beginTransaction();
			sessionRef.persist(e1);
			sessionRef.persist(e2);
			tx.commit();
			System.out.println("Employees is created");
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
