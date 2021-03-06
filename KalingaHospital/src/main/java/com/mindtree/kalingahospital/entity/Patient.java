package com.mindtree.kalingahospital.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	
	private String patientName;
	private int billAmt;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Doctor doctors;

	public Patient() {
		super();
	}

	public Patient(int patientId, String patientName, int billAmt, Doctor doctors) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.billAmt = billAmt;
		this.doctors = doctors;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(int billAmt) {
		this.billAmt = billAmt;
	}

	public Doctor getDoctors() {
		return doctors;
	}

	public void setDoctors(Doctor doctors) {
		this.doctors = doctors;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", billAmt=" + billAmt
				+ ", doctors=" + doctors + "]";
	}
	
	

}
