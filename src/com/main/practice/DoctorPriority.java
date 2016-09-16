package com.main.practice;

public class DoctorPriority implements Comparable<DoctorPriority>{

	private Doctor doc;
	private int priority;
	
	public DoctorPriority(Doctor doctor, int val) {
		// TODO Auto-generated constructor stub
		this.doc = doctor;
		this.priority = val;
	}

	public Doctor getDoc() {
		return doc;
	}

	public void setDoc(Doctor doc) {
		this.doc = doc;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public int compareTo(DoctorPriority dp)
	{
		return dp.getPriority() - this.priority;
	}
	
}
