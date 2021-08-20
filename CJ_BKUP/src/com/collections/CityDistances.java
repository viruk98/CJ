package com.collections;

import java.util.ArrayList;
import java.util.List;
public class CityDistances {

	static List<City> cities=new ArrayList<City>();
	public static void main(String[] args) {
		cities.add(new  City("Delhi",15,15));
		cities.add(new  City("Mumbai",5,50));
		cities.add(new  City("kolkata",25,50));
		cities.add(new  City("Chennai",25,80));
		cities.add(new  City("Bangalore",15,70));
		printDistance("Delhi","Mumbai");
		printDistance("Delhi","Hyderabad");
		printDistance("kolkata","Chennai");
		printDistance("kolkata","Bangalore");
		printDistance("Delhi","Bangalore");
	}
	private static void printDistance(String name1,String name2) {
		City first=null,second=null;
		for(City city:cities) {
			if(city.equals(name1)) {first=city;}
			if(city.equals(name2)) {second=city;}
		}
		if(first!=null && second!=null && first!=second) {
			int distance=(int)Math.sqrt((first.x-second.x)*(first.x-second.x)+(first.y-second.y)*(first.y-second.y));
			System.out.println(first.name.charAt(0)+"->"+second.name.charAt(1)+" "+distance+" ,");
		}
		else {
			System.out.println("NA");
		}
	}
}
