package cocubes.java.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseArray {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist=new ArrayList<Integer>();
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(4);
		arraylist.add(6);
		Collections.reverse(arraylist);
//		Iterator<Integer> it=arraylist.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		for(Integer i:arraylist)
		{
			System.out.println(i);
		}

	}

}
