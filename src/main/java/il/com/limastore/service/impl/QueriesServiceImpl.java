package il.com.limastore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import il.com.limastore.dao.QueriesDao;
import il.com.limastore.model.Queries;

@Service
public class QueriesServiceImpl implements il.com.limastore.service.QueriesService {

	@Autowired
	private QueriesDao queryDao;

	public void addQuery(Queries queries) {

		queryDao.addQuery(queries);
	}

}
