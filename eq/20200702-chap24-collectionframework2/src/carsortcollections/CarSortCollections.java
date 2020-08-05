package carsortcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Car implements Comparable<Car>
{
	private int disp;
	
	public Car (int d)
	{
		disp = d;
	}
	
	@Override
	public String toString()
	{
		return "cc: " + disp;
	}
	@Override
	public int compareTo(Car o)
	{
		return disp - o.disp;
	}
}

public class CarSortCollections
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Car> list = new ArrayList<>();
		list.add(new Car(1200));
		list.add(new Car(3000));
		list.add(new Car(1800));
		Collections.sort(list);
		
		for(Iterator<Car> itr = list.iterator(); itr.hasNext();)
		{
			System.out.println(itr.next().toString()+ '\t');
		}
		System.out.println();
	}

}
