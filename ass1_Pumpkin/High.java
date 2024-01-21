package ass1_pumpkin;

//Yarin Ackerman 
//Rami Abu Rabia 

public class High {
	
	private final int maxHeight;
	private static int count=1;
	
	public High(int maxHeight) { //Parameter constructor
		
		this.maxHeight=maxHeight;
	}
	
	public synchronized void theBigPumpkin(Pumpkin p) { //Method that declares winner and finishing positions
		
			
		if(count==1) { //Checking if the current pumpkin is the winner
			
			System.out.println("********************\n"+"->"+p.getPumpID() + " is the winner: Max height!"+"\n********************"); //Printing the winner
			
			count++; //Increasing count by one
		}
		else {
			
			System.out.println("********************\n"+"->"+p.getPumpID() + " is on "+count+ " place"+"\n********************"); //Printing the non winners positions 
		
			count++; //Increasing count by one
		}

	}

	public int getMaxHeight() { //Getter
		return maxHeight;
	}

	public static int getCount() { //Getter
		return count;
	}

	public static void setCount(int count) { //Setter
		High.count = count;
	}
	
}
