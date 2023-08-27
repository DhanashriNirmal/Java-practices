package JavaProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Collection_Arraylist {
	public static void main(String args[]) {
	
//		ArrayList<Integer> arraylist = new ArrayList<Integer>();
//		arraylist.add(10);
//		
//		for(Integer i:arraylist)
//		{
//			System.out.println(i);
//		}
		
		ArrayList<Integer> arraylist1=new ArrayList<Integer>();
		arraylist1.add(100);
		arraylist1.add(20);
		arraylist1.add(50);
		//arraylist1.add(null);
		arraylist1.add(30);
		
		Collections.sort(arraylist1);
		for(Integer i:arraylist1)
		{
			System.out.println(i);
		}
		Collections.reverse(arraylist1);
		for(Integer i:arraylist1)
		{
			System.out.println(i);
		}
		System.out.println("Max element:"+Collections.max(arraylist1));
		System.out.println("Min element:"+Collections.min(arraylist1));
//		System.out.println("==============================================");
//		ArrayList<Integer> arraylist2=new ArrayList<Integer>();
//		arraylist2.add(100);
//		arraylist2.add(200);
//		arraylist2.add(300);
//		
//		arraylist1.addAll(arraylist2);
//		for(Integer i:arraylist1)
//		{
//			System.out.println(i);
//		}
//		
//		System.out.println("==============================================");
//		ArrayList<Integer> arraylist3=new ArrayList<Integer>();
//		arraylist3.add(10);
//		arraylist3.add(20);
//		arraylist3.add(30);
//		arraylist3.add(40);
//		arraylist3.add(50);
//		//arraylist3.remove(4);
//		//arraylist3.removeAll(arraylist1);
//		arraylist3.clear();
//		for(Integer i:arraylist3)
//		{
//			System.out.println(i);
//		}
//		
//		System.out.println("==============================================");
//		ArrayList<Integer> arraylist4=new ArrayList<Integer>();
//		arraylist4.add(10);
//		arraylist4.add(20);
//		arraylist4.add(30);
//		arraylist4.add(40);
//		arraylist4.add(50);
//		
//		System.out.println(arraylist4.get(0));
//		System.out.println(arraylist4.isEmpty());
//		System.out.println(arraylist1.isEmpty());
//		
//		Iterator<Integer> it=arraylist1.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
//		System.out.println(arraylist4.size());
//		System.out.println(arraylist4.contains(200));
//		
//		System.out.println("==============================================");
//		LinkedList<Integer> linkedlist=new LinkedList<Integer>();
//		linkedlist.add(10);
//		linkedlist.add(20);
//		linkedlist.add(30);
//		Iterator<Integer> it1=linkedlist.iterator();
//		while(it1.hasNext())
//		{
//			System.out.println(it1.next());
//		}
////		 LinkedHashSet<String> set=new LinkedHashSet<>();  
////         set.add("One");    
////         set.add("Two");    
////         set.add("Three");   
////         set.add("Four");  
////         set.add("Five");  
////         Iterator<String> i=set.iterator();  
////         while(i.hasNext())  
////         {  
////         System.out.println(i.next());  
////         }  
//		
//	}
	}
}
