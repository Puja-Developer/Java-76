package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import co.edureka.entity.Student;
import co.edureka.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) throws Exception {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();

		/*
		  //String hql = "from co.edureka.entity.Student"; 
		  String hql = "from co.edureka.entity.Student where sname='Sachin'"; Query<Student> query =
		  session.createQuery(hql); 
		  List<Student> students = query.getResultList();
		 */

		// working with positional parameters in HQL
		/*
		  String hql = "from co.edureka.entity.Student where studid between ?1 and ?2";
		  Query<Student> query = session.createQuery(hql); query.setParameter(1, 101);
		  query.setParameter(2, 106); List<Student> students = query.getResultList();
		 */

		// working with named parameters in HQL
		/*
		String hql = "from co.edureka.entity.Student where studid between :minsid and :maxsid";
		Query<Student> query = session.createQuery(hql);
		query.setParameter("minsid", 103);
		query.setParameter("maxsid", 250);
		List<Student> students = query.getResultList();
		*/
		
		/*
		String hql = "from co.edureka.entity.Student where sname like '%ni%'"; 
		Query<Student> query = session.createQuery(hql); 
		List<Student> students = query.getResultList();
		
		for (Student st : students) {
			System.out.println(st);
			Thread.sleep(1000);
		}
		*/
		
		//to perform DML operation with HQL
		Transaction tx = session.beginTransaction();
		
		String hql = "update co.edureka.entity.Student stud set stud.sname='Sunil',stud.email='sunil@hotmail.com' where stud.studid=101";
				
		Query<Student> q = session.createQuery(hql);
		int rows_affected = q.executeUpdate();
		System.out.println("Student Updated = "+rows_affected);
		tx.commit();
		
		session.close();
		sf.close();
	}
}
