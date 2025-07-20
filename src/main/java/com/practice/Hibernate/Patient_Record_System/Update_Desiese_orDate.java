package com.practice.Hibernate.Patient_Record_System;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import patientRecord.Entity.Patients;
import patientRecord.Utility.PatientRecordUtility;

public class Update_Desiese_orDate {

	public void updateDetails() {
		
	SessionFactory factory = PatientRecordUtility.getSessionFactory();

	Session session = factory.openSession();

	Transaction transaction = session.beginTransaction();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Patient id: ");
	
	int pid = sc.nextInt();
	sc.nextLine();
	
	Patients p1 = session.find(Patients.class, pid);
	int patientNo = sc.nextInt();
	p1.setId(patientNo);
	
	transaction.commit();
	session.close();
	
	
}
}
