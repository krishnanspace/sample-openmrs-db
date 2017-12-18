package org.openmrs.module.basicmodule.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.openmrs.module.basicmodule.dao.GetPatDao;
import org.openmrs.module.basicmodule.entity.Krish_Patient_POJO;

public class GetPatDaoImpl implements GetPatDao {
	
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Krish_Patient_POJO> getpat() {
		Session session = sessionFactory.getCurrentSession();
		List<Krish_Patient_POJO> list = (List<Krish_Patient_POJO>) session.createCriteria(Krish_Patient_POJO.class).list();
		
		return list;
	}
	
}
