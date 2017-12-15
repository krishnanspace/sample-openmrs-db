package org.openmrs.module.basicmodule.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.openmrs.module.basicmodule.entity.Krish_Patient_POJO;
import org.openmrs.module.basicmodule.service.GetPatientService;
import org.springframework.beans.factory.annotation.Autowired;

public class GetPatientServiceImpl implements GetPatientService {
	
	@Autowired
	public SessionFactory sessionFactory;
	
	@Override
	public List<Krish_Patient_POJO> getAllPatients() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		List<Krish_Patient_POJO> list = currentSession.createCriteria(Krish_Patient_POJO.class).list();
		
		return list;
	}
	
}
