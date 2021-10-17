package com.phoenix.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
// homework : ceiling key, floor key, higher key, lower key, headMap, 
public class ActorPhoneMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map<String,Long> actorPhMap = new HashMap<String,Long>(); // unordered and unsorted
		// Map<String,Long> actorPhMap = new LinkedHashMap<String,Long>(); // ordered but unsorted
		Map<String,Long> actorPhMap = new TreeMap<String,Long>(); // ordered and sorted
		/*
		Comparator<String> c = Collections.reverseOrder();
		Map<String,Long> actorPhMap = new TreeMap<String,Long>(c); // ordered and sorted
		*/
		actorPhMap.put("Parshwa", 9898989898L);
		actorPhMap.put("Varun",   7878787878L);
		actorPhMap.put("John",    7979797979L);
		actorPhMap.put("Salman",  8989898989L);
		
		//Using get method to fetch details of particular actor
		System.out.println("Phone No of Parshwa :" + actorPhMap.get("Parshwa"));
		
		//Printing key,value pairs
		
        System.out.println(actorPhMap);
         
         //Using Iterator
         Set<String> actors = actorPhMap.keySet();
         Iterator<String> it =actors.iterator();
         while(it.hasNext())
         {
        	 String actorName = it.next();
        	 long phoneNo = actorPhMap.get(actorName);
        	 System.out.println("Actor Name :" + actorName + "\tPhone No :" + phoneNo);
         }
         
         /*
         NavigableMap<String, Long> navMap = ((TreeMap<String, Long>) actorPhMap).headMap("John", false);
         System.out.println(navMap);
         */
         NavigableMap<String, Long> navMap = ((TreeMap<String, Long>) actorPhMap).headMap("John", true);
         System.out.println(navMap);
         
         /*
         NavigableMap<String, Long> tailMap = ((TreeMap<String, Long>) actorPhMap).tailMap("John", true);
         System.out.println(tailMap);
         */
         NavigableMap<String, Long> tailMap = ((TreeMap<String, Long>) actorPhMap).tailMap("John", false);
         System.out.println(tailMap);
         
         SortedMap<String, Long> sbMap = ((TreeMap<String, Long>) actorPhMap).subMap("John", "Salman"); 
         System.out.println(sbMap);
	}

}
