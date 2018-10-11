package com.cg.project.iodemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOClassesDemo {
	public static void fileClassDemo() throws IOException {
		File file = new File("D:\\SundarLalBishnoi\\DataFile.txt");
		System.out.println("File existence: "+ file.exists());
		if(!file.exists())
			file.createNewFile();
		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println("Length: "+file.length());
		System.out.println("Path: "+file.getPath());
		System.out.println("Name: "+file.getName());
	}
	public static void byteStreamReadWrite(File fileFrom,File fileTo) throws IOException {
		try(BufferedInputStream srcStream= new BufferedInputStream(new FileInputStream(fileFrom))){
			try(BufferedOutputStream destStream=new BufferedOutputStream(new FileOutputStream(fileTo))){
				byte[] dataBuffer = new byte[(int) fileFrom.length()];
				srcStream.read(dataBuffer);
				destStream.write(dataBuffer);
			}
		}
		System.out.println("File has Transferred");
	}
}
