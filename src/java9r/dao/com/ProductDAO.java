package java9r.dao.com;
import java9r.entites.com.*;
import java9r.util.com.*;
import org.hibernate.*;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.IntegerType;
import org.hibernate.type.Type;

import java.util.*;
public class ProductDAO {
	private SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	
	
	public void addnewrecord(Product p){
		try {
			if(!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			sessionFactory.getCurrentSession().save(p);
			sessionFactory.getCurrentSession().getTransaction().commit();
			
		} catch (Exception e) {
			sessionFactory.getCurrentSession().getTransaction().rollback();
			throw e;
		}
	}
	
	
	

}
