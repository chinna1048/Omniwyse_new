public class Staff  {

private static User user;
private static Patient patient;
private static Doctor doctor;
private static Nurse nurse;
private static Staff staff;


private long staffId;
private int yearOfExprience;
private String description;
private double salary;

public static User getUser() {
return user;
}
public static void setUser(User user) {
Staff.user = user;
}

public long getStaffId() {
return staffId;
}
public void setStaffId(long staffId) {
this.staffId = staffId;
}
public int getYearOfExprience() {
return yearOfExprience;
}
public void setYearOfExprience(int yearOfExprience) {
this.yearOfExprience = yearOfExprience;
}
public String getDescription() {
return description;
}
public void setDescription(String description) {
this.description = description;
}
public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}

public static void main(String[] args) {

user = new User();
patient = new Patient();
doctor = new Doctor();
nurse = new Nurse();
staff = new Staff();

user.setEmail("ram.nath@gmail.com");
user.setFirstName("Ram");
user.setLastName("Nath");
user.setGender("Male");
user.setId(101);


patient.setUser(user);
System.out.println(patient.getUser());
patient.setPatientId(102);
patient.setInsured(true);
System.out.println("Patient Id- " + patient.getPatientId());

//System.out.println(patient);
doctor.setUser(user);
System.out.println(doctor.getUser());
doctor .setDoctorId(103);
doctor.setSpecialization("Cardiologist");
System.out.println("Dotor Id- " + doctor.getDoctorId());
System.out.println("Dotor specilization- " + doctor.getSpecialization());

nurse.setUser(user);
System.out.println(nurse.getUser());
nurse.setNurseId(104);
System.out.println("Nurse Id- " + nurse.getNurseId());

staff.setUser(user);
System.out.println(staff.getUser());
staff.setStaffId(105);
staff.setYearOfExprience(13);
staff.setSalary(40000);
staff.setDescription("Work very fine");
System.out.println("Staff Id- " + staff.getStaffId());
System.out.println("Staff experience- " + staff.getYearOfExprience());
System.out.println("Staff salary- " + staff.getSalary());
System.out.println("Staff about- " + staff.getDescription());

System.out.println("user Id- " + user.getId());
System.out.println("First name- " + user.getFirstName());
System.out.println("Last name- " + user.getLastName());
System.out.println("Gender- " + user.getGender());
System.out.println("Email- " + user.getEmail());

}

}