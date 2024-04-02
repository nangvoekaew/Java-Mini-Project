import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Staff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x;
		String userName ;
		String password ;
		
		
		Scanner sc=new Scanner(System.in);
		
		Doctor doctor=new Doctor();
		StaffInfo staff=new StaffInfo();
		Patient patient=new Patient();
		Payment bill=new Payment();
		Appointment appointment=new Appointment();
		DoctorAvailability DA=new DoctorAvailability();
		LuckyDraw lucky=new LuckyDraw();

		JLabel label = new JLabel(" Welcome to Vibharam Hospital Service System ");
		JOptionPane.showMessageDialog(null,label);
		
		
		userName=JOptionPane.showInputDialog("Enter Your UserName");	
		password=JOptionPane.showInputDialog("Enter Your Password");
			
		
		if(userName.equals("Lanka") && password.equals("123")  || userName.equals("Nay") && password.equals("123") || userName.equals("Friouz") && password.equals("123") ) 
		{
				
		do {
			
	
				
				String[] acceptableValues = {"Detail of Doctors","Details of Staffs", "Appointment","Payment","Emergency","Change Appointment","Event Lucky Draw"};
			    String process = (String)JOptionPane.showInputDialog(null,
			            "What kind of service would you like to process?",
			            "Hospital process",
			            3,
			            null,
			            acceptableValues,
			            acceptableValues[0]);
			    
			    //Details of Doctors
			    if(process.equals(acceptableValues[0])){
			    	doctor.Doctor_Detail();
			    	
			    }
			    
			    //Details of Staffs
			    if(process.equals(acceptableValues[1])) {    	
			    	System.err.println("                                           Details of Staffs                                               ");
			    	System.out.println("------------------------------------------------------------------------------------------------------------");
			    	staff.Staff_Details();
			    	
			    }
			    
			    //Make Appointment
			    if(process.equals(acceptableValues[2]))
			    {
			    	appointment.make_Appointment();
			    	
			    	//Confirm  
			    	String AppointmentDate = JOptionPane.showInputDialog(null,"Enter the Appointment Date (DD/MM/YY)","Appointment Date",3);
			    	int result = JOptionPane.showConfirmDialog(null, "Can you comfirm the appointment on " + AppointmentDate + "?", "Confirmation", JOptionPane.YES_NO_OPTION);
			        if (result == JOptionPane.YES_OPTION) {
			        	switch(appointment.Doctor)
			    		{
			    			case "Dr. John Smith"     : DA.John();break;
			    			case "Dr. Ada Wong"       : DA.Ada();break;
			    			case "Dr. Jessica Smith"  : DA.Jessica();break;
			    			case "Dr. Michael Johnson": DA.Jessica();break;
			    			case "Dr. Emily Wang"     : DA.Emily();break;
			    			case "Dr. David Martinez" : DA.David();break;
			    			case "Dr. Sarah Lee"      : DA.Sarah();break;
			    			case "Dr. Lisa Kim"       : DA.Lisa();break;
			    			case "Dr. Michael Wang"   : DA.MichaelWang();break;
			    			case "Dr. Ashley Graham"  : DA.Ashley();
			    	
			    		}
	    	
			        	System.out.print("Enter the patient's Name         : ");
				    	patient.name1=sc.nextLine();
				    	System.out.print("Enter the patient's Phone Number : ");
				    	patient.phoneNo=sc.nextLine();
				    	System.out.println("*****************************************************************************************");
				
				    	System.out.println("Patient's Name         : "+patient.name1);
				    	System.out.println("Patient's Phone Number : "+patient.phoneNo);
				    	System.out.println("Doctor's Name          : "+appointment.Doctor);
				    	System.out.println("Department             : "+appointment.booking_kind);
				    	System.out.println("Patient's Name         : "+patient.name1);
				    	System.out.println("Patient's Phone Number : "+patient.phoneNo);
				    	System.out.println("Thank you! Your Appointment is successful on ".concat(AppointmentDate));

				    	System.out.println("*****************************************************************************************");
				    	
			    	
			        }
			        else if (result == JOptionPane.NO_OPTION) {
			            System.out.println("The appointment is cancelled");
			        } else {
			            System.out.println("Appointment function closed");
			        }
			    	
			    	

			  }
			    
			    //Make payment
			    if(process.equals(acceptableValues[3])){
			    	appointment.make_Appointment();
			    	patient.Patient_Detail();
					bill.Billing_Detail(patient.name1,patient.age,patient.gender,patient.phoneNo,patient.address,appointment.Doctor ,appointment.AppointmentDate,DA.time,appointment.booking_kind);
					
			    }
			    
			    //Emergency cases
			    if(process.equals(acceptableValues[4])){
			    	appointment.Doctor="Dr. Jonth Smith";
			    	long bmi=patient.Patient_Emergency();
					bill.Billing_Emergency(patient.name2,appointment.Doctor,patient.blood_type,bmi);
					
			    	
			    }
			    
			    //Change Appointment
			    if(process.equals(acceptableValues[5])){
			    	appointment.change_appointment();
			    }
			    
			    //Event Lucky Draw
			    if(process.equals(acceptableValues[6])){
			    	lucky.Event();
			    }
			    
 
			    int result = JOptionPane.showConfirmDialog(null, "Do you want to continue your process?", "Confirmation", JOptionPane.YES_NO_OPTION);
		    	x= result==JOptionPane.YES_OPTION? true:false;
		    	
				
			}while(x);
		
			
			
			}else {
				JOptionPane.showMessageDialog(null," Incorrect username or passwords,Please ! Login Again");
				
			}
	    	
		sc.close();
		}
	}
	