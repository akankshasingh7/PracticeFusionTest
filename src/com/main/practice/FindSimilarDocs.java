package com.main.practice;

import java.util.*;


public class FindSimilarDocs {
	
	List<Doctor> doctorDirectory = new ArrayList<Doctor>();
	
	public boolean populateDirectory(List<Doctor> doctors)
	{
		System.out.println(" Adding list of Doctors to directory .....");
		
		if(doctors==null || doctors.size()==0)
			return false;
		doctorDirectory.addAll(doctors);
		return true;
		
		
	}
	
	public List<Doctor> findDoctorsSimilarTo(Doctor objDoc)
	{
		if(objDoc==null)
		{
			System.out.println(" Please enter correct doctor property...");
			return null;
		}
		PriorityQueue<DoctorPriority> pq = new PriorityQueue<DoctorPriority>(5);
		int val;
		List<Doctor> retList = new ArrayList<Doctor>();
		for(int i=0; i<doctorDirectory.size(); i++)
		{
			val = objDoc.compareTo(doctorDirectory.get(i));
			pq.offer(new DoctorPriority(doctorDirectory.get(i),val));
		}
		
		
		
		for(int i=0; i<5;i++)
		{
			DoctorPriority dp = pq.poll();
			if(dp!=null)
			{
				retList.add(dp.getDoc());
			}
			
			
		}
		
		return retList;
	}

	public static void main(String[] args)
	{
		FindSimilarDocs f1 = new FindSimilarDocs();
		List<Doctor> docs = new ArrayList<Doctor>();
		docs.add(new  Doctor("Dr. Rubi" ,"Dentist" , "San jose" ,4));
		docs.add(new  Doctor("Dr. Ravi" ,"Dentist" , "San jose" ,2));
		docs.add(new  Doctor("Dr. Hary" ,"Dentist" , "Santa clara" ,3));
		docs.add(new  Doctor("Dr. Paula" ,"Surgeon" , "San jose" ,4));
		docs.add(new  Doctor("Dr. Isabella" ,"Dentist" , "San Jose" ,1));
		docs.add(new  Doctor("Dr. Mary" ,"Surgeon" , "San francisco" ,5));
		docs.add(new  Doctor("Dr. Shin" ,"Surgeon" , "San Jose" ,4));
		docs.add(new  Doctor("Dr. Robert" ,"Orthopedic" , "San francisco" ,4));
		docs.add(new  Doctor("Dr. Tom" ,"Surgeon" , "San francisco" ,4));
		docs.add(new  Doctor("Dr. Ram" ,"Orthopedic" , "San francisco" ,5));
		docs.add(new  Doctor("Dr. Sheryl" ,"Orthopedic" , "San Jose" ,5));
		docs.add(new  Doctor("Dr. Gordan" ,"Surgeon" , "San francisco" ,3));
		docs.add(new  Doctor("Dr. Peter" ,"Orthopedic" , "Santa clara" ,3));
		docs.add(new  Doctor("Dr. Leela" ,"Surgeon" , "San francisco" ,3));
		docs.add(new  Doctor("Dr. Brandon" ,"Dentist" , "San Jose" ,4));
		docs.add(new  Doctor("Dr. Harkey" ,"Surgeon" , "San francisco" ,3));
		f1.populateDirectory(docs);
		List<Doctor> returnValues = f1.findDoctorsSimilarTo(new Doctor("Yami", "Orthopedic", "SAN Francisco", 3));
		for(int i=0; i<returnValues.size(); ++i)
			System.out.println(returnValues.get(i).toString());
	}
}
