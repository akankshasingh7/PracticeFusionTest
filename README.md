# PracticeFusionTest

How to run the application

1. Download the project, open as a Maven project in Eclipse
2. Run the FindSimilarDoctors file, it has a sample test given in the main method.
3. Run the FindSimilarDoctorsTest file , it has unit test cases for the application.

Following are the assumptions made to find similar Doctors , given a Doctor :


Two doctor are similar based on the following priorities : 

1. If they have similar "speciality" , like Surgeons, Physicians etc., the percentage of similarity is highest 
2. If they are working in similar "area"  , like in San Francisco, San Mateo , the percentage of similarity is 2nd highest 
3. If they have same "review scores " , the percentage of similarity is 3rd highest.

Example : Given Doctor with values as Name : " Akanksha ", Speciality : " Surgeon ", Area : "San Jose " ,Review Score: 5
the FindSimilarDoctors class will return the list of all doctors with same speciality, area and review score, based on the priority mentioned above
