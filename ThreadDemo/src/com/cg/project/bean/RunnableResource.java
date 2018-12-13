package com.cg.project.bean;

public class RunnableResource implements Runnable {

	@Override
	public void run() {
		try{
			Thread t = Thread.currentThread();
			if(t.getName().equals("even"))
				for (int i = 1; i <= 10; i++){
					if(i%2==0)
						System.out.println("Even Thread : "+i);
					Thread.sleep(800);
				}
			else if(t.getName().equals("odd"))
				for (int i = 1; i <= 10; i++)	{
					if(i%2!=0)
						System.out.println("Odd Thread : "+i);
					Thread.sleep(500);
				}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

}
