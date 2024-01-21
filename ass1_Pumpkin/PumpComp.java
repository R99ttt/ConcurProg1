package ass1_pumpkin;

import java.util.Scanner;

public class PumpComp {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Yarin Ackerman 
		//Rami Abu Rabia 
		
		System.out.println("Enter max Pumpkin height");
		int max=scanner.nextInt();
		
		High maxHeight = new High(max);
		
		Pumpkin p1 = new Pumpkin("One" , maxHeight , 0);
		Pumpkin p2 = new Pumpkin("Two" , maxHeight , 0);
		Pumpkin p3 = new Pumpkin("Three" ,maxHeight , 0);
		Pumpkin p4 = new Pumpkin("Four" , maxHeight , 0);
		Pumpkin p5 = new Pumpkin("Five" , maxHeight , 0);
		
		
		
		MyThread myThread1 = new MyThread(p1);
		MyThread myThread2 = new MyThread(p2);
		MyThread myThread3 = new MyThread(p3);
		MyThread myThread4 = new MyThread(p4);
		MyThread myThread5 = new MyThread(p5);
		
		Thread thread1 = new Thread(myThread1); 
		Thread thread2 = new Thread(myThread2); 
		Thread thread3 = new Thread(myThread3); 
		Thread thread4 = new Thread(myThread4); 
		Thread thread5 = new Thread(myThread5); 
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		
	}

}
