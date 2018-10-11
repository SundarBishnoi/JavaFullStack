package com.cg.project.collectiondemo;
import java.util.HashSet;

import com.cg.project.beans.Associate;

public class HashClassesDemo {
	public static void hashSetClassWork() {
		HashSet<Associate> associateSet = new HashSet<>();
		associateSet.add(new Associate(103, 10000, "Rakesh"));
		associateSet.add(new Associate(102, 5000, "Kunal"));
	}
}