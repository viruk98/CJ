package com.viru;

//import java.util.Collection;
//import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Demo {


	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<>();
		Map<Integer, String> m1 = new HashMap();
        // Add elements to the map
		//System.out.println("hashtable"+map);
		map.put(10, "vishal");
		map.put(20, "vaibhav");
        map.put(30, "sachin");
        
        
        
        //System.out.println("hashmap"+m1);
        m1.put(10, "vishal");
        m1.put(30, "sachin");
      m1.put(60, "kk");
        m1.put(20, "vaibhav");
        m1.put(40, "vaibhav");
  
        
        System.out.println(map);
        System.out.println();
        Iterator<Integer> it1=map.keySet().iterator();
        
        while (it1.hasNext()) {
            Integer element = it1.next();
            System.out.println(element);
            System.out.println("hashtable");
        }
        System.out.println(m1);
        Iterator<Integer> it=m1.keySet().iterator();
        while (it.hasNext()) {
        	Integer element = it.next();
        	System.out.println(element);
        	System.out.println("hashmap");
        }
        
	}
}
