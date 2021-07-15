package il.com.limastore.dao.impl;

import il.com.limastore.model.Queries;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import il.com.limastore.model.Queries;

@Repository
public class QueriesDaoImpl implements il.com.limastore.dao.QueriesDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addQuery(Queries queries) {
		Session session = sessionFactory.openSession();
		session.save(queries);
		session.close();
	}
}
