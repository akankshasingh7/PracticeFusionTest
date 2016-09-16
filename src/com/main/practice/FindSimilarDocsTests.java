package com.main.practice;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FindSimilarDocsTests {
	FindSimilarDocs f1 =new FindSimilarDocs();
	
	@Test
	public void testValidPopulate() {
		
		List<Doctor> docs = new ArrayList<Doctor>();
		docs.add(new  Doctor("Rubi" ,"Dentist" , "San jose" ,4));
		docs.add(new  Doctor("Ravi" ,"Dentist" , "San jose" ,2));
		docs.add(new  Doctor("Hary" ,"Dentist" , "Santa clara" ,3));
		docs.add(new  Doctor("Paula" ,"Surgeon" , "San jose" ,4));
		docs.add(new  Doctor("Isabella" ,"Dentist" , "San Jose" ,1));
		docs.add(new  Doctor("Lula" ,"Surgeon" , "San francisco" ,1));
		assertTrue(f1.populateDirectory(docs));
		
	}
	
	@Test
	public void testNullPopulate()
	{
		//FindSimilarDocs f1 =new FindSimilarDocs();
		assertFalse(f1.populateDirectory(null));
		
	}
	
	@Test
	public void testEmptyPopulate()
	{
		//FindSimilarDocs f1 =new FindSimilarDocs();
		List<Doctor> list = new ArrayList<Doctor>();
		assertFalse(f1.populateDirectory(list));
		
	}
	
	@Test
	public void testfindDoctorsSimilarToNullDoctorVal()
	{
		List<Doctor> docs = new ArrayList<Doctor>();
		docs.add(new  Doctor("Rubi" ,"Dentist" , "San jose" ,4));
		docs.add(new  Doctor("Ravi" ,"Dentist" , "San jose" ,2));
		docs.add(new  Doctor("Hary" ,"Dentist" , "Santa clara" ,3));
		docs.add(new  Doctor("Paula" ,"Surgeon" , "San jose" ,4));
		docs.add(new  Doctor("Isabella" ,"Dentist" , "San Jose" ,1));
		docs.add(new  Doctor("Lula" ,"Surgeon" , "San francisco" ,1));
		f1.findDoctorsSimilarTo(null);
	}
	
	@Test
	public void testfindDoctorsSimilarToGivenDoctorNull()
	{
		List<Doctor> docs = new ArrayList<Doctor>();
		docs.add(new  Doctor("Rubi" ,"Dentist" , "San jose" ,4));
		docs.add(new  Doctor("Ravi" ,"Dentist" , "San jose" ,2));
		docs.add(new  Doctor("Hary" ,"Dentist" , "Santa clara" ,3));
		docs.add(new  Doctor("Paula" ,"Surgeon" , "San jose" ,4));
		docs.add(new  Doctor("Isabella" ,"Dentist" , "San Jose" ,1));
		docs.add(new  Doctor("Lula" ,"Surgeon" , "San francisco" ,1));
		assertNull(f1.findDoctorsSimilarTo(null));
	}
	
	@Test
	public void testfindDoctorsSimilarToGivenDoctorNotNull()
	{
		System.out.println(" in test 5");
		List<Doctor> docs = new ArrayList<Doctor>();
		docs.add(new  Doctor("Rubi" ,"Dentist" , "San jose" ,4));
		docs.add(new  Doctor("Ravi" ,"Dentist" , "San jose" ,2));
		docs.add(new  Doctor("Hary" ,"Dentist" , "Santa clara" ,3));
		docs.add(new  Doctor("Paula" ,"Surgeon" , "San jose" ,4));
		docs.add(new  Doctor("Isabella" ,"Dentist" , "San Jose" ,1));
		docs.add(new  Doctor("Lula" ,"Surgeon" , "San francisco" ,1));
		f1.populateDirectory(docs);
		assertNotNull(f1.findDoctorsSimilarTo(new Doctor("Yami", "Ortho", "SAN JOSE", 3)));
	}


}
