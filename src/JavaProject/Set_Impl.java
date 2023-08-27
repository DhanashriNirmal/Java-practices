package JavaProject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Impl {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();  
         set.add("One");    
         set.add("Two");    
         set.add("Three");   
         set.add("Four");  
         set.add("Five");  
         Iterator<String> i=set.iterator();  
         while(i.hasNext())  
         {  
        	 System.out.println(i.next());  
         }  
         System.out.println("==============================================");
         
         LinkedHashSet<String> set2=new LinkedHashSet<String>();
         set2.add("Dhanashri");
         set2.add("pilly");
         Iterator<String> it=set2.iterator();
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
	}

}
