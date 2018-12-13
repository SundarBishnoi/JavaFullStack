package com.cg.project.bean;
public class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	
	public MyThread(ThreadGroup group, Runnable target) {
		super(group, target);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		if(this.getName().equals("even"))
			for (int i = 1; i <= 50; i++)	
				if(i%2==0)
					System.out.println("Even Thread : "+i);
		if (this.getName().equals("odd"))
			for (int j = 1; j <=50; j++) 
				if(j%2!=0)
					System.out.println("Odd thread : "+j);
	}
}