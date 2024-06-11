package JavaProgrammes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(10);
		a.add(2);
		a.add(12);
		a.add(9);
		a.add(45);
		System.out.println("Before Sorting");
		System.out.println(a);
		Collections.sort(a,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				
				return o2.compareTo(o1);
			}
		});
		System.out.println("After Sorting");
		Iterator itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		}

	}


