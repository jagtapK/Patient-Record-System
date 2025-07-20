package com.practice.Hibernate.Patient_Record_System;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import patientRecord.Entity.Patients;
import patientRecord.Utility.PatientRecordUtility;

public class DeletePatientByID {
	
	public void PatientId() {
	// 1.session factory
			SessionFactory factory = PatientRecordUtility.getSessionFactory();
			
			// 2.session from session factory
			Session session = factory.openSession();
			
			// 3.Transaction from session
			Transaction transaction = session.beginTransaction();
			
			Patients pt = session.find(Patients.class, 401);
			session.remove(pt);
			
			transaction.commit();
			
			session.clear();
			
	}		
}
