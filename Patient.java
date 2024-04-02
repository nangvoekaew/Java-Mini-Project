import java.util.Scanner;

public class Patient {
	String name1,name2,phoneNo,address,gender,medical_record;
	int age;
	double weight,height;
	String blood_type;
	Scanner sc=new Scanner(System.in);
	
	
	public void Patient_Detail(){
		System.out.println("                   Pateint's information                    ");
		System.out.println("------------------------------------------------------------");
		System.out.print("Enter Your  Full Name   : ");
		name1=sc.nextLine();
		
		System.out.print("Enter Your Age          : ");
		age=sc.nextInt();
		
		System.out.print("Enter Your Phone Number : ");
		phoneNo=sc.next();
		
		System.out.print("Enter Your Address      : ");
		address=sc.next();
		
		System.out.print("Enter Your Gender       : ");
		gender=sc.next();
		
		System.out.print("Enter Your Past Medical Records: ");
		medical_record=sc.next();
		
	}
	public long Patient_Emergency() {
		// TODO Auto-generated method stub
		System.out.println("                   Pateint's information                    ");
		System.out.println("------------------------------------------------------------");
		System.out.print("Enter Your Full Name    : ");
		name2=sc.nextLine();
		System.out.print("Enter your blood Type   : ");
    	blood_type=sc.next();
    	System.out.print("Enter your weight       : ");
    	weight=sc.nextDouble();
    	System.out.print("Enter your height       : ");
    	height=sc.nextDouble();
    	
    	//Calculate Patient's BMI
    	return Math.round((weight/Math.pow(height, 2))*703);
    	
    	
    	}

}
