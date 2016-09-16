package com.main.practice;

public class Doctor implements Comparable<Doctor>{

	String name;
	String speciality;
	String area;
	int reviewScore;
	
	public Doctor(String name, String speciality,  String area, int score)
	{
		this.name = name;
		this.speciality = speciality;
		this.area = area;
		this.reviewScore = score;
		
	}
	
	/*
	 * Overridden method compareTo using multiple fields to compare doctors
	 * This method compares the doctors based on the following order of priorities
	 * 1. Speciality - Doctors with the same speciality will be ranked highest
	 * 2. Area - Doctors in the same area will be ranked 2nd highest
	 * 3. Ranking - Doctors with the same ranking will be ranked 3rd highest
	 * 
	 */
	public int compareTo(Doctor d1)
	{
		if(this.speciality.equalsIgnoreCase(d1.speciality))
		{
			if(this.area.equalsIgnoreCase(d1.area))
			{
				if(this.reviewScore==d1.reviewScore)
				{	return 1000;}
				else
				{	return 1000-(Math.abs(this.reviewScore-d1.reviewScore));}
				
			}else
			{
				if(this.reviewScore==d1.reviewScore)
				{	return 100;}
				else
				{	return 100-(Math.abs(this.reviewScore-d1.reviewScore));}
				
			}
		}
		else
		{
			if(this.area.equalsIgnoreCase(d1.area))
			{
				if(this.reviewScore==d1.reviewScore)
				{	return 50;}
				else
				{	return 50-(Math.abs(this.reviewScore-d1.reviewScore));}
				
			}else
			{
				if(this.reviewScore==d1.reviewScore)
				{	return 20;}
				else
				{	return 20-(Math.abs(this.reviewScore-d1.reviewScore));}
				
			}
		}
	}
	
	public String toString()
	{
		return 	"Name : "+this.name+
				" , Speciality : "+this.speciality+
				" , Area : "+this.area+
				" , Review Score : "+this.reviewScore;
		
	}
	
	
}
