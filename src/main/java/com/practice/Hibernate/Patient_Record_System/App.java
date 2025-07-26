package com.practice.Hibernate.Patient_Record_System;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Patient Registration System! ");

		System.out.println("Choose an option: " + "\n1.Add new Patient" + "\n2.Delete Patient By Id"
				+ "\n3.Update Desiese" + "\n4.Set_Details" + "\n5.Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice");

		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {
		case 1:
			Add_new_patient ap = new Add_new_patient();
			ap.AddPatients();
			break;

		case 2:
			DeletePatientByID d = new DeletePatientByID();
			d.PatientId();
			break;

		case 3:
			Update_Desiese_orDate u = new Update_Desiese_orDate();
			u.updateDetails();
			break;

		case 4:
			Add_Details s = new Add_Details();
			s.Set_Details();
			break;
			
		case 5:
			System.out.println("Exiting program. Goodbye!");
			System.exit(0); // Terminates the program immediately
			break;
		}
	}
}
