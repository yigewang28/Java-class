/*  
 *  Author: Yige Wang
 *  Created: 10/02/2014
 *  This is an example of implementing Comparable Interface
 */


public class Student implements Comparable<Student> 
{
	private String name;
	private double gpa;
	
	// default constructor
	Student() {}
	
	// constructor with parameters
	Student(String name, double gpa)
	{
		this.name = name;
		this.gpa = gpa;
	}
	
	// override compareTo() method to compare the GPA of students
	public int compareTo(Student a)
	{
		if(gpa < a.gpa) return -1;
		else if(gpa == a.gpa) return 0;
		else return 1;
	}
	
	// Since name and gpa are private, we need to define getName() and getGpa() to allow outer class gets the value
	public String getName()
	{
		return name;
	}
	
	public double getGpa()
	{
		return gpa;
	}
}
