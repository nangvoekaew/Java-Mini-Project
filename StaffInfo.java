import java.util.Scanner;

public class StaffInfo {
	
	public void Staff_Details() {
		
        Scanner sc = new Scanner(StaffInfo.class.getResourceAsStream("StaffsInfo.txt"));     
        System.out.println("ID\tName\t\t\tRole\t\t\tContact\t\tAddress");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");

		 for (int lineNumber = 1; sc.hasNextLine(); lineNumber++) {
	            String line = sc.nextLine();
	            System.out.println(lineNumber+"\t"+line);
	        }
	        
	        System.out.println("-----------------------------------------------------------------------------------------------------------------");

	        sc.close();
	    }    
	}


