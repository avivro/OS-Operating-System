

import java.util.Arrays;
import java.util.concurrent.Semaphore;


public class Print_countLoop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		Myprint();
		System.out.println("end");
		
	}


	private static void Myprint() {
		
		Semaphore [] sem =new Semaphore[3];
		Args [] args =new Args[3];
		Thread [] threads =new Thread[3];
		
		for (int i = 0; i < sem.length; i++) {
			sem[i]=new Semaphore((i == 0)?1:0);
		}
		
		for (int i = 0; i < sem.length; i++) {
			args[i]=new Args(i,sem);
			threads[i] = new Thread(new MyRunnableTask(args[i]));
			threads[i].start();
		}
		
		for (int i = 0; i < threads.length; i++) {
			try {
				System.out.println("sssssssssssssssssss"+threads[i].getId());
				threads[i].join();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}


