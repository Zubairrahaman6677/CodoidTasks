package JavaProject;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class java55 {

	public static void main(String[] args)
	{
        //Iterate the LinkedHashMap values
		
		LinkedHashMap<String, String> linkedHashMap
		= new LinkedHashMap<String, String>();

		linkedHashMap.put("One", "First element");
		linkedHashMap.put("Two", "Second element");
		linkedHashMap.put("Three", "Third element");

		Set entrySet = linkedHashMap.entrySet();

		Iterator it = entrySet.iterator();

		System.out.println("LinkedHashMap entries : ");

		while (it.hasNext())

			System.out.println(it.next());
	}
}
