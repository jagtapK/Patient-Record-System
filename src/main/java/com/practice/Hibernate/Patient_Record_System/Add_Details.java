package com.practice.Hibernate.Patient_Record_System;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import patientRecord.Entity.Disease;
import patientRecord.Entity.Patients;
import patientRecord.Utility.PatientRecordUtility;

public class Add_Details {

	public static void main(String[] args) {
		
		//One to Many
		
		SessionFactory factory =PatientRecordUtility.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Patients p = new Patients();;
        p.setName("Anjali");
        p.setAge(20);
        p.setDisease("Cough");
        p.setAdmittedDate("12/2/2022");
        
        Disease d = new Disease();
        d.setD1Name("Cold");
        d.setD2Name("Korona");
        
        Disease d2 = new Disease();
        d2.setD1Name("Cold");
        d2.setD2Name("Viral Infection");
        
        List<Disease> list = Arrays.asList(d, d2);
        p.setDisease(list);
        
        session.persist(p);

        transaction.commit();
        session.close();
        
        
	}

}
