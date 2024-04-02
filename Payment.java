import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Payment {
	String firstName,lastName;
	double price;
	double rate=0.07;
	char blood_Type;
	int spaceIndex;
	
	Scanner sc=new Scanner(System.in);
	
	LocalDateTime currentTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String Date_Time = currentTime.format(formatter);

	
	public void Billing_Detail(String patient_name,int patient_age,String patient_gender,String patient_PhNo,String patient_address,String doctor_name,String date,String time,String illnes_description){
                
		System.out.print("Enter the total price   : ");
		price=sc.nextDouble();
		price=price*(1+rate);
		
		
		//Split first name and last name from full name
		spaceIndex = patient_name.indexOf(' ');
		
		if (spaceIndex == -1) {
            firstName = patient_name;
            lastName = "No Last Name"; 
        } else {
            firstName = patient_name.substring(0, spaceIndex);
            lastName = patient_name.substring(spaceIndex + 1);
        }
		

		
		System.out.println("************************************************************");
		System.out.println("                           Receipt                       ");
		System.out.println("************************************************************");
		System.out.println(" Today's Date & Time         "+Date_Time);
		System.out.println("------------------------------------------------------------");
		System.out.println("Patient's First Name        : "+firstName);
		System.out.println("Patient's Last Name         : "+lastName);
		System.out.println("Patient's Age               : "+patient_age);
		System.out.println("Patient's Gender            : "+patient_gender);
		System.out.println("Patient's Phone Number      : "+patient_PhNo);
		System.out.println("Patient's Address           : "+patient_address);
		System.out.println("Doctor's Name               : "+doctor_name);
		System.out.println("Illness Description         : "+illnes_description);
		System.out.println("Total price include tax(7%) : $"+(float)price);
		System.out.println("************************************************************");

		

}
	public void Billing_Emergency(String name,String doctor,String blood_type,long bmi) {
		
		System.out.print("Enter the total price   : ");
		price=sc.nextDouble();
		price=price*(1+rate);
		
		//Split first name and last name from full name
		spaceIndex = name.indexOf(' ');
		
		if (spaceIndex == -1) {
            firstName = name;
            lastName = "No Last Name"; 
        } else {
            firstName = name.substring(0, spaceIndex);
            lastName = name.substring(spaceIndex + 1);
        }
		
		System.out.println("************************************************************");
		System.out.println("                           Receipt                       ");
		System.out.println("************************************************************");
		System.out.println(" Today's Date & Time         "+Date_Time);
		System.out.println("------------------------------------------------------------");
		System.out.println("Patient's First Name        : "+firstName);
		System.out.println("Patient's Last Name         : "+lastName);

		System.out.println("Patient's Blood Type        : "+blood_type);
		System.out.println("Patient's BMI               : "+bmi);
		System.out.println("Doctor's Name               : "+doctor);
		System.out.println("Illness Description         : Emergency case");
		System.out.println("Total price include tax(7%) : $"+(float)price);
		System.out.println("************************************************************");
		
		

	
}
	
}

