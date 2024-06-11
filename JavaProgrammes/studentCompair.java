package JavaProgrammes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class studentCompair implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getPercentage(), o1.getPercentage());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student>a=new ArrayList();
		a.add(new Student("Shri",92.00));
		a.add(new Student("ABC",45.56));
		a.add(new Student("pqr",56.6));
		a.add(new Student("Shrija",99.99));
		a.add(new Student("Sojas",99.99));
		
		Collections.sort(a,new studentCompair());
		System.out.println("Sorted Students (descending order):");
        Iterator<Student> iterator = a.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("Name: " + student.getName() + ", Percentage: " + student.getPercentage());
        }
		
		

	}

	
}
