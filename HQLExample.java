package com.hibernate.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.util.HibernateUtil;

public class HQLExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionfactory = HibernateUtil.getSessionFactory();
		
		
		SessionFactory sf = HibernateUtil.getSessionFactory();{
			
		System.out.println("reading from employee table");
		Session session = sf.openSession();
		String queryString = "from Employee where id =:id";
		Query query = session.createQuery(queryString);
		query.setParameter("id", 1);
		
		List list = query.list();
		
		Employee empObj = (Employee)list.get(0);
		System.out.println("name: " + empObj.getEmpName());
		
		session.close();
	}

		
		
		
	}

	}


