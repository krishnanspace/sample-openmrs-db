package org.openmrs.module.basicmodule.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.openmrs.module.basicmodule.dao.GetPatDao;
import org.openmrs.module.basicmodule.entity.Krish_Patient_POJO;
import org.openmrs.module.basicmodule.service.GetPatientService;
import org.springframework.beans.factory.annotation.Autowired;

public class GetPatientServiceImpl implements GetPatientService {
	
	private GetPatDao getp;
	
	public void setDao(GetPatDao dao) {
		this.getp = dao;
	}
	
	@Override
	public List<Krish_Patient_POJO> getpat() {
		
		return getp.getpat();
	}
	
}
