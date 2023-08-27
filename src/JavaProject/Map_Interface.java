package JavaProject;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Interface {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map1=new LinkedHashMap<>();
		map1.put(98221604, "Kirnu");
		
		map1.put(95611377, "Pilly");
		map1.put(88069074, "Dhanashri");
		map1.put(null, null);
		map1.put(12345678, null);
		
		
		
		Set<Entry<Integer,String>> set=map1.entrySet();
		
		for(Entry<Integer, String> ee:set)
		{
			System.out.println(ee.getKey()+" = "+ee.getValue());
		}
	}

}
