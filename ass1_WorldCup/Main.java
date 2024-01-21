package ass1;

import java.io.*;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		//Yarin Ackerman 
		//Rami Abu Rabia 
		
		ArrayList <String> rank1= new ArrayList<>();  // Creating arrays for each rank
		ArrayList <String> rank2= new ArrayList<>();
		ArrayList <String> rank3= new ArrayList<>();
		ArrayList <String> rank4= new ArrayList<>();
		
		ArrayList <ArrayList <String>> ranks = new ArrayList<>(); // Creating 2d array to fit all ranks
		
		rank1.add("1 England"); // Adding national teams to their ranks
		rank1.add("Germany");
		rank2.add("2 Denmark");
		rank3.add("3 Austrelia");
		rank4.add("4 Qatar");
		
		ranks.add(rank1); // Adding ranks to array of ranks 
		ranks.add(rank2);
		ranks.add(rank3);
		ranks.add(rank4);
		
		try { //Exeption handling with try & catch
			
			write(ranks);
		} 
		
		catch (IOException e) { 
			
			System.err.println("Error writing to file");
		}  
		
		try { 
			
			read();
		} 
		
		catch (IOException e) { //Exeption handling with try & catch
			
			System.err.println("Error reading from file");
		} 
	}
	
	public static void write(ArrayList <ArrayList <String>> rank) throws IOException {
		
		FileWriter fw = new FileWriter("ranks.txt"); // Creating new file writer
		PrintWriter pw = new PrintWriter(fw); // Creating new print writer
		
		for(ArrayList<String> str : rank) { 
			
			pw.println(str.toString().replace("[", "").replace("]", "").replace(",", "")); // Writing the national teams from array to file 	
		}
		
		pw.close(); // Closing print writer
		fw.close(); // Closing file writer 
	}
	
	public static void read() throws IOException {
		
		FileReader fr= new FileReader("ranks.txt"); // Creating new file reader
		BufferedReader br = new BufferedReader(fr); // Creating new buffered reader
		
		String str = br.readLine(); //Assigning str to the first row of the file
		
		while(str != null) { 
			
			System.out.println(str); //prints the current row
			str=br.readLine(); //Assigning str to the next line	
		}
		
		br.close(); // Closing buffered reader
		fr.close(); // Closing file reader
	}
	
}
