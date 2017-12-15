package org.openmrs.module.basicmodule.rest.resource;

import java.util.List;

import org.openmrs.module.basicmodule.entity.Krish_Patient_POJO;
import org.openmrs.module.basicmodule.service.GetPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/rest")
public class MyController {
	
	@Autowired
	private GetPatientService getpat;
	
	@RequestMapping(method = RequestMethod.GET, value = "getpats")
	@ResponseBody
	public List<Krish_Patient_POJO> getpats() {
		List<Krish_Patient_POJO> list = getpat.getAllPatients();
		return list;
	}
}
