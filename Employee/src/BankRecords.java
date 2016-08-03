import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.Iterator;

public  class BankRecords implements Client{
	
	

	    public static void main(String[] args) throws IOException {
	    	
	    	BankRecords bankRecords = new BankRecords();
	    	

	      

	        ArrayList<String> data = new ArrayList<String>(1000);
	        bankRecords.readData(data);
	        bankRecords.printData(data);

	        
	    }
	    
	   
 
     //   System.out.println("Retrieving values from ArrayList using get method");
       // retrieveValuesFromListMethod2(data);
	 
	    
	    @Override
		public void readData(ArrayList data) {
			// TODO Auto-generated method stub
	    	  Scanner scanner = new Scanner(new File("bank-Detail.csv"));

		        // Chomp off at each new line, then add to array or arraylist
		        scanner.useDelimiter("\n");
	    	while (scanner.hasNext()) {

	            // Grab data between commas to add to ArrayList
	            scanner.useDelimiter(",");
	            // Add grabbed data to ArrayList
	            data.add(scanner.next());

	        }

	       // System.out.println(data.get(10));
	         // System.out.println(data);

	        scanner.close();

	        
			
		} 

	    public  void printData(ArrayList data)
	    {
	        //Retrieving values from list
	        int size = data.size();
	        for(int i=0;i<25;i++)
	        {
	            System.out.println(data);
	        }
	    }

	    
		
		@Override
		public void processData() {
			// TODO Auto-generated method stub
			
		}

	/***	@Override
		public void printData() {
			// TODO Auto-generated method stub
			
		} ***/
	}	
	