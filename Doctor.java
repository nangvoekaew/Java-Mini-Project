public class Doctor {
	int ID, age;
    String D_Name, address, PhoneNo, specialization; 
    char Gender;
    
    public void Doctor_Detail() {
    	
    	System.err.println("                                           Details of Doctors                                               ");
    	System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("ID \tDoctor Name \t\tAge \tGender \tSpecialization \tAddress \t\t\tPhoneNumber");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        
        ID = 1; 
        D_Name = "Dr. John Smith"; 
        age = 45; 
        Gender = 'M';
        specialization = "Heart"; 
        address = "123 Main St, Cityville"; 
        PhoneNo = "(123) 456-7890";
        
        System.out.println(ID + "\t" + D_Name + "\t\t" + age + "\t" + Gender + "\t" 
                           + specialization + "\t\t" + address + "\t" + PhoneNo);
        
        ID++;
        D_Name = "Dr. Ada Wong";
        age = 35; 
        Gender = 'F'; 
        specialization = "Heart"; 
        address = "456 Elm St, Townsville";
        PhoneNo = "(987) 654-3210";
        
        System.out.println(ID + "\t" + D_Name + "\t\t" + age + "\t" + Gender + "\t" 
                + specialization + "\t\t" + address + "\t" + PhoneNo);
        
        ID++;
        D_Name = "Dr. Jessica Smith"; 
        age = 40; 
        Gender = 'F'; 
        specialization = "Skin"; 
        address = "789 Oak St, Villageton"; 
        PhoneNo = "(555) 123-4567";
        
        System.out.println(ID + "\t" + D_Name + "\t" + age + "\t" + Gender + "\t" 
                + specialization + "\t\t" + address + "\t" + PhoneNo);

        ID++;
        D_Name = "Dr. Michael Johnson"; 
        age = 50; 
        Gender = 'M'; 
        specialization = "Skin"; 
        address = "101 Pine St, Hilltown"; 
        PhoneNo = "(222) 333-4444";
        
        System.out.println(ID + "\t" + D_Name + "\t" + age + "\t" + Gender + "\t" 
                + specialization + "\t\t" + address + "\t" + PhoneNo);

        ID++;
        D_Name = "Dr. Emily Wang"; 
        age = 55; 
        Gender = 'F'; 
        specialization = "Bone"; 
        address = "456 Maple St, Riverside"; 
        PhoneNo = "(777) 888-9999";
        
        System.out.println(ID + "\t" + D_Name + "\t\t" + age + "\t" + Gender + "\t" 
                + specialization + "\t\t" + address + "\t" + PhoneNo);

        ID++;
        D_Name = "Dr. David Martinez"; 
        age = 47; 
        Gender = 'M'; 
        specialization = "Bone"; 
        address = "123 Birch St, Lakeside"; 
        PhoneNo = "(666) 777-8888";
        
        System.out.println(ID + "\t" + D_Name + "\t" + age + "\t" + Gender + "\t" 
                + specialization + "\t\t" + address + "\t" + PhoneNo);

        ID++;
        D_Name = "Dr. Sarah Lee"; 
        age = 42; 
        Gender = 'F'; 
        specialization = "General"; 
        address = "789 Cedar St, Mountain"; 
        PhoneNo = "(999) 000-1111";
        
        System.out.println(ID + "\t" + D_Name + "\t\t" + age + "\t" + Gender + "\t" 
                + specialization + "\t\t" + address + "\t" + PhoneNo);

        ID++;
        D_Name = "Dr. Lisa Kim"; 
        age = 38; 
        Gender = 'F'; 
        specialization = "General"; 
        address = "101 Elm St, Seaside"; 
        PhoneNo = "(333) 444-5555";
        
        System.out.println(ID + "\t" + D_Name + "\t\t" + age + "\t" + Gender + "\t" 
                + specialization + "\t\t" + address + "\t" + PhoneNo);

        ID++;
        D_Name = "Dr. Michael Wang"; 
        age = 48; 
        Gender = 'M'; 
        specialization = "Other"; 
        address = "555 Oak St, Countryside"; 
        PhoneNo = "(123) 456-7890";
        
        System.out.println(ID + "\t" + D_Name + "\t\t" + age + "\t" + Gender + "\t" 
                + specialization + "\t\t" + address + "\t" + PhoneNo);

        ID++;
        D_Name = "Dr. Ashley Graham"; 
        age = 36; 
        Gender = 'F'; 
        specialization = "Other"; 
        address = "777 Maple St, Towns"; 
        PhoneNo = "(987) 654-3210";
        
        System.out.println(ID + "\t" + D_Name + "\t" + age + "\t" + Gender + "\t" 
                + specialization + "\t\t" + address + "\t" + PhoneNo);
        System.out.println("------------------------------------------------------------------------------------------------------------");


    }
}
