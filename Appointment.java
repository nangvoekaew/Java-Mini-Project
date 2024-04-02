import javax.swing.JOptionPane;

public class Appointment {
String Doctor, AppointmentDate, booking_kind, name;
int result;
	
	public void make_Appointment() {
		
	String[] acceptableValues = {"Heart", "Skin", "Bone", "General", "Other"};
    		booking_kind = (String)JOptionPane.showInputDialog(null,
            "What kind of doctor would you like to search?",
            "Doctor's Appointment",
            3,
            null,
            acceptableValues,
            acceptableValues[1]);
    
    if (booking_kind.equals("Heart")) {
    String[] Heart_Doctor = {"Dr. John Smith", "Dr. Ada Wong"};
    		Doctor = (String)JOptionPane.showInputDialog(null,
            "Choose the doctor that you want to make appointment with",
            "Heart Specialized Doctors",
            3,
            null,
            Heart_Doctor,
            Heart_Doctor[1]);

    }
    
    if (booking_kind.equals("Skin")) {
        String[] Skin_Doctor = {"Dr. Jessica Smith", "Dr. Michael Johnson"};
        		Doctor = (String)JOptionPane.showInputDialog(null,
                "Choose the doctor that you want to make appointment with",
                "Skin Specialized Doctors",
                3,
                null,
                Skin_Doctor,
                Skin_Doctor[1]);
    }
    
    if (booking_kind.equals("Bone")) {
        String[] Bone_Doctor = {"Dr. Emily Wang", "Dr. David Martinez"};
        		Doctor = (String)JOptionPane.showInputDialog(null,
                "Choose the doctor that you want to make appointment with",
                "Bone Specialized Doctors",
                3,
                null,
                Bone_Doctor,
                Bone_Doctor[1]);
    }
    
    if (booking_kind.equals("General")) {
        String[] General_Doctor = {"Dr. Sarah Lee", "Dr. Lisa Kim"};
        		Doctor = (String)JOptionPane.showInputDialog(null,
                "Choose the doctor that you want to make appointment with",
                "General Specialized Doctors",
                3,
                null,
                General_Doctor,
                General_Doctor[1]);
    }
    
    if (booking_kind.equals("Other")) {
        String[] Other_Doctor = {"Dr. Michael Wang", "Dr. Ashley Graham"};
        		Doctor = (String)JOptionPane.showInputDialog(null,
                "Choose the doctor that you want to make appointment with",
                "Other Doctors",
                3,
                null,
                Other_Doctor,
                Other_Doctor[1]);
    }

    	
    }
	public void change_appointment() {
		name = JOptionPane.showInputDialog(null,"Enter the patient's name","Change Appointment",3);
		AppointmentDate = JOptionPane.showInputDialog(null,"Enter the Appointment Date you want to change \n(DD/MM/YY)","Appointment Date",3);
    	result = JOptionPane.showConfirmDialog(null, "Can you comfirm the appointment date you want to change on " + AppointmentDate + "?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) { result = 1;
        	System.out.println("      The appointment date has been changed");
        	System.out.println("--------------------------------------------------");
        	System.out.println("Patient Name                : " + name);
            System.out.println("The appointment date        : " + AppointmentDate);
            System.out.println("**************************************************");
            System.out.println("!Please be sure to come on the appointment day!");
            System.out.println("--------------------------------------------------");
            }
            else if (result == JOptionPane.NO_OPTION) {
			       System.out.println("The appointment changing is cancelled");
			    } else {
			       System.out.println("Appointment change function closed");
			    }
        }   
	}
    


