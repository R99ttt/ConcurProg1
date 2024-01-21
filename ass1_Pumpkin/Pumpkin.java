package ass1_pumpkin;

//Yarin Ackerman 
//Rami Abu Rabia 

public class Pumpkin {
	
	private String pumpID; 
	private High h;
	private int height;

	public Pumpkin(String pumpID, High h, int height) { //Parameter constructor
		
		setPumpID(pumpID);
		setH(h);
		setHeight(height);
		
	}

	public void grow() { // Method that grows the pumpkins
		
		setHeight(this.height+(int)(Math.random()*10)+1); //Setting random growth each time
			
		if(this.height<h.getMaxHeight()) { //Growing the pumpkin only if the current height is smaller than max height
			
			System.out.println(pumpID +": "+(h.getMaxHeight()-this.height)+ " cm to max height"); // Growing the pumpkin and printing growth details
		}
		
		System.out.println();
		
	}
	
	public String getPumpID() { //Getter
		
		return pumpID;
	}

	public void setPumpID(String pumpID) { //Setter
		
		this.pumpID = pumpID;
	}

	public High getH() { //Getter
		
		return h;
	}

	public void setH(High h) { //Setter
		
		this.h = h;
	}

	public int getHeight() { //Getter
		
		return height;
	}

	public void setHeight(int height) { //Setter
		
		this.height = height;
	}
	
}
