import javax.swing.JOptionPane;

public class DoctorAvailability {
	String time;

    public void John() {
        JOptionPane.showMessageDialog(null,
                "Doctor Name \t\t\t Available Times\n" +
                "---------------------------------------------\n" +
                "Dr. John Smith \t\t\t 09:00 AM - 12:00 PM, 02:00 PM - 05:00 PM\n" +
                "Heart Specialized Doctor" );
        String[] acceptableValues = {"09:00AM - 12:00PM" , "02:00PM - 05:00 PM"};
        time = (String) JOptionPane.showInputDialog(null,
                "Choose the desired time",
                "Dr. John Smith",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
    }

    public void Ada() {
        JOptionPane.showMessageDialog(null,
                "Doctor Name \t\t\t Available Times\n" +
                "---------------------------------------------\n" +
                "Dr. Ada Wong \t\t\t 10:00 AM - 01:00 PM, 03:00 PM - 06:00 PM\n" +
                "Heart Specialized Doctor" );
        String[] acceptableValues = {"10:00AM - 01:00PM" , "03:00PM - 06:00 PM"};
        time = (String) JOptionPane.showInputDialog(null,
                "Choose the desired time",
                "Dr. Ada Wong",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
    }

    public void Jessica() {
        JOptionPane.showMessageDialog(null,
                "Doctor Name \t\t\t Available Times\n" +
                "---------------------------------------------\n" +
                "Dr. Jessica Smith \t\t\t 08:30 AM - 11:30 AM, 02:00 PM - 05:00 PM\n" +
                "Skin Specialized Doctor");
        String[] acceptableValues = {"08:30AM - 11:30AM" , "02:00PM - 05:00 PM"};
        time = (String) JOptionPane.showInputDialog(null,
                "Choose the desired time",
                "Dr. Jessica Smith",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
    }

    public void Michael() {
        JOptionPane.showMessageDialog(null,
                "Doctor Name \t\t\t Available Times\n" +
                "---------------------------------------------\n" +
                "Dr. Michael Johnson \t\t\t 09:30 AM - 12:30 AM, 03:00 PM - 06:00 PM\n" +
                "Skin Specialized Doctor" );
        String[] acceptableValues = {"09:30AM - 12:30PM" , "03:00PM - 06:00 PM"};
        time = (String) JOptionPane.showInputDialog(null,
                "Choose the desired time",
                "Dr. Michael Johnson",
                3,
                null, 
                acceptableValues,
                acceptableValues[1]);
    }

    public void Emily() {
        JOptionPane.showMessageDialog(null,
                "Doctor Name \t\t\t Available Times\n" +
                "---------------------------------------------\n" +
                "Dr. Emily Wang \t\t\t 10:00 AM - 01:00 PM, 03:00 PM - 06:00 PM\n"+
                "Bone Specialized Doctor" );
        String[] acceptableValues = {"10:00AM - 01:00PM" , "03:00PM - 06:00 PM"};
        time = (String) JOptionPane.showInputDialog(null,
                "Choose the desired time",
                "Dr. Emily Wang",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
    }

    public void David() {
        JOptionPane.showMessageDialog(null,
                "Doctor Name \t\t\t Available Times\n" +
                "---------------------------------------------\n" +
                "Dr. David Martinez \t\t\t 08:00 AM - 11:00 AM, 02:00 PM - 05:00 PM\n"+ 
                "Bone Specialized Doctor");
        String[] acceptableValues = {"08:00AM - 11:00AM" , "02:00PM - 05:00 PM"};
        time = (String) JOptionPane.showInputDialog(null,
                "Choose the desired time",
                "Dr. David Martinez",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
    }

    public void Sarah() {
        JOptionPane.showMessageDialog(null,
                "Doctor Name \t\t\t Available Times\n" +
                "---------------------------------------------\n" +
                "Dr. Sarah Lee \t\t\t 09:00 AM - 12:00 PM, 02:00 PM - 05:00 PM\n" +
                "General Specialized Doctor");
        String[] acceptableValues = {"09:00AM - 12:00PM" , "02:00PM - 05:00 PM"};
        time = (String) JOptionPane.showInputDialog(null,
                "Choose the desired time",
                "Dr. Sarah Lee",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
    }

    public void Lisa() {
        JOptionPane.showMessageDialog(null,
                "Doctor Name \t\t\t Available Times\n" +
                "---------------------------------------------\n" +
                "Dr. Lisa Kim \t\t\t 10:00 AM - 01:00 PM, 03:00 PM - 06:00 PM\n"+
                "General Specialized Doctor");
        String[] acceptableValues = {"10:00AM - 01:00PM" , "03:00PM - 06:00 PM"};
        time = (String) JOptionPane.showInputDialog(null,
                "Choose the desired time",
                "Dr. Lisa Kim",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
    }

    public void MichaelWang() {
        JOptionPane.showMessageDialog(null,
                "Doctor Name \t\t\t Available Times\n" +
                "---------------------------------------------\n" +
                "Dr. Michael Wang \t\t\t 08:30 AM - 11:30 AM, 01:30 PM - 04:30 PM\n" +
                "Other Specialized Doctor");
        String[] acceptableValues = {"08:30AM - 11:30AM" , "01:30PM - 04:30 PM"};
        time = (String) JOptionPane.showInputDialog(null,
                "Choose the desired time",
                "Dr. Michael Wang",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
    }

    public void Ashley() {
        JOptionPane.showMessageDialog(null,
                "Doctor Name \t\t\t Available Times\n" +
                "---------------------------------------------\n" +
                "Dr. Ashley Graham \t\t\t 09:00 AM - 12:00 PM, 02:00 PM - 05:00 PM\n" +
                "Other Specialized Doctor" );
        String[] acceptableValues = {"09:00AM - 12:00PM" , "02:00PM - 05:00 PM"};
        time = (String) JOptionPane.showInputDialog(null,
                "Choose the desired time",
                "Dr. Ashley Graham",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);
    }

}
