public class Test
{   public static void main(String args[])  
    { 
          
        User user = new User(); 
        Patient patient = new Patient();
        Nurse nurse = new Nurse();
        Doctor doctor = new Doctor();
        
        System.out.println("Parent class User Child Class Patient");
        patient.setEmail("medarichinna143@gmail.com");
        patient.setFirstName("Pushpa kumar");
        patient.setLastName("Medari");
        patient.setGender("Male");
        patient.setId(1048);       

        System.out.println("user Id- " + patient.getId());
        System.out.println("First name- " + patient.getFirstName());
        System.out.println("Last name- " + patient.getLastName());
        System.out.println("Gender- " + patient.getGender());
        System.out.println("Email- " + patient.getEmail());
        System.out.println();


        patient.setPatientId(1065);
        patient.setInsured(true);
        System.out.println("Patient Id- " + patient.getPatientId());
        System.out.println("Patient Insured- " + patient.isInsured());
        System.out.println();


        System.out.println("Parent Class User Child Staff -- Nurse");

        // nurse.setEmail("medarichinna143@gmail.com");
        // nurse.setFirstName("Pushpa kumar");
        // nurse.setLastName("Medari");
        // nurse.setGender("Male");
        // nurse.setId(1048);     
        // System.out.println();
  

        System.out.println("user Id- " + nurse.getId());
        System.out.println("First name- " + nurse.getFirstName());
        System.out.println("Last name- " + nurse.getLastName());
        System.out.println("Gender- " + nurse.getGender());
        System.out.println("Email- " + nurse.getEmail());
        System.out.println();


        nurse.setStaffId(6548);
        nurse.setYearsOfExperience(13);
        nurse.setSalary(40000);
        nurse.setDescription("Work very fine");
        System.out.println("Staff Id- " + nurse.getStaffId());
        System.out.println("Staff experience- " + nurse.getYearsOfExperience());
        System.out.println("Staff salary- " + nurse.getSalary());
        System.out.println("Staff about- " + nurse.getDescription());
        System.out.println();

        nurse.setNurseId(1065);
        System.out.println("Nurse Id- " + nurse.getNurseId());
        System.out.println();


    } 
}
/*

Parent class User Child Class Patient
user Id- 1048
First name- Pushpa kumar
Last name- Medari
Gender- Male
Email- medarichinna143@gmail.com

Patient Id- 1065
Patient Insured- true

Parent Class User Child Staff -- Nurse
user Id- 0
First name- null
Last name- null
Gender- null
Email- null

Staff Id- 6548
Staff experience- 13
Staff salary- 40000.0
Staff about- Work very fine

Nurse Id- 1065

*/