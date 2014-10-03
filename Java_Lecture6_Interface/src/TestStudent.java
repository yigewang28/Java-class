import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*  
 *  Author: Yige Wang
 *  Created: 10/02/2014
 *  This is an example of implementing Comparable Interface
 */

public class TestStudent 
{
	public static void main(String[] args)
	{
		Student a = new Student("John",3.5 );
		Student b = new Student("Amy",3.6);
		Student c = new Student("Fred", 4.0);
		Student d = new Student("Harry",2.8);
		
		// test compareTo() method by comparing the gpa of student a and b
		if(a.compareTo(b)<0)
			System.out.println(a.getName()+" has a lower GPA than "+b.getName());
		else if(a.compareTo(b)>0)
			System.out.println(a.getName()+" has a higher GPA than "+b.getName());
		
		Set<Student> studentSet = new TreeSet<Student>();
		studentSet.add(a);
		studentSet.add(b);
		studentSet.add(c);
		studentSet.add(d);
		
		Iterator<Student> i=studentSet.iterator();
		while(i.hasNext())
			System.out.println(((Student)i.next()).getName());
	}
}
