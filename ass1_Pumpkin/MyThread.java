package ass1_pumpkin;

//Yarin Ackerman 
//Rami Abu Rabia 

public class MyThread implements Runnable {

	private Pumpkin p;
	
	public MyThread(Pumpkin p) { //Parameter constructor
		
		this.p=p;
		
	}
	
	@Override
	public void run() { //Imlementing the "run" method
		
		while(p.getHeight()<=p.getH().getMaxHeight()) {  //Setting while condition for threads to keep running
			
			try {
			
				Thread.sleep(2000);
			
			} 
			catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			p.grow(); //Calling grow method
			
		}
		
		
		p.getH().theBigPumpkin(p); //Calling bigPumpkin method
		System.out.println();
		
	}

}
