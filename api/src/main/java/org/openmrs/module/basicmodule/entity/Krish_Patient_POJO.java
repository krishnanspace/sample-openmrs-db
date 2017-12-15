package org.openmrs.module.basicmodule.entity;

public class Krish_Patient_POJO {
	
	int patient_id;
	
	String firstname;
	
	String lastname;
	
	public int getPatient_id() {
		return patient_id;
	}
	
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "Krish_Patient_POJO [patient_id=" + patient_id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
}
