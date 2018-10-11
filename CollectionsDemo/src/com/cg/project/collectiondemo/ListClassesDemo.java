package com.cg.project.collectiondemo;
import java.util.ArrayList;
import java.util.Collections;
import com.cg.project.beans.Associate;

public class ListClassesDemo {
	public static void ArrayListClassWork() {
/*		ArrayList<String> strList = new ArrayList<>();
		//insert
		strList.add("Satish");
		strList.add("Rakesh");
		strList.add("Kunal");
		strList.add("Satish");
		strList.add("Kumar");
		//searching
		System.out.println(strList.contains("Satish"));
		System.out.println(strList.indexOf("Satish"));
		
		//sort
		Collections.sort(strList);
		
		//display
		for (String name : strList) 
			System.out.println(name);
	*/
		ArrayList< Associate>	associateList = new ArrayList<>();
		associateList.add(new Associate(101, 15000, "Satish"));
		associateList.add(new Associate(103, 10000, "Rakesh"));
		associateList.add(new Associate(102, 5000, "Kunal"));
		for (Associate associate : associateList) {
			if(associate.getAssociatId()==101 && associate.getFirstName().equals("Satish"))
				System.out.println(associate.getSalary());
		}
		Collections.sort(associateList,new AssociateComparator());
		for (Associate associate : associateList) 
			System.out.println(associate.toString());
		Collections.sort(associateList);
		for (Associate associate : associateList) 
			System.out.println(associate.toString());
	}
}