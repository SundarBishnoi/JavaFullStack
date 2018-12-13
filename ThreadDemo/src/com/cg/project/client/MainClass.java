package com.cg.project.client;
import com.cg.project.bean.RunnableResource;
public class MainClass {
	public static void main(String[] args) {
		/*try {//ThreadDemo with thread object
		MyThread th1 = new MyThread("even");
		MyThread th2 = new MyThread("odd");
		th1.start();
		th2.start();*/
			//Thread demo with Runnable object
			/*RunnableResource r1 = new RunnableResource();
			Thread th1 = new Thread(r1, "even");
			Thread th2 = new Thread(r1, "odd");
			th1.start();
			th1.join();
			th2.start();
			System.out.println("main ends here");*/
			
			Runnable runnableResource = ()->{
				for (int i = 1; i <=10; i++) {
					System.out.println("Tik Tik "+i);
				}
			};
			Thread th1 = new Thread(runnableResource);
			th1.start();
		/*} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}