package com.cg.project.collectiondemo;

import java.util.Comparator;

import com.cg.project.beans.Associate;

public class AssociateComparator implements Comparator<Associate>{

	@Override
	public int compare(Associate arg0, Associate arg1) {
		// TODO Auto-generated method stub
		return arg0.getSalary()-arg1.getSalary();
	}
	

}
