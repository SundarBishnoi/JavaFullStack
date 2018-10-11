package com.cg.project.iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MainClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//IO Demo
		File fileFrom = new File("D:\\SundarLalBishnoi\\DataFile.txt");
		File fileTo	= new File("C:\\New folder\\DateFile.txt");
		if (!fileTo.exists())
			fileTo.createNewFile();
		IOClassesDemo.fileClassDemo();
		IOClassesDemo.byteStreamReadWrite(fileFrom, fileTo);
		
		//Serialization Demo
/*		File file	= new File("C:\\New folder\\DateFile.txt");
		SerializationDemo.doSerialization(file);
		SerializationDemo.doDeserialization(file);*/
		
		//ProjectProperties Demo
		/*Properties projectProperties = new Properties();
		projectProperties.load(new FileInputStream(".//resources//projectProperties.properties"));
		String projectKey1 = projectProperties.getProperty("projectKey1");
		String projectKey2 = projectProperties.getProperty("projectKey2");
		System.out.println(projectKey1 + " "+projectKey2);*/
	}
}
