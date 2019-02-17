public class Department
{
    public String Name;
    public Doctor[] Doctors;
    public Nurse[] Nurses;
    public Patient[] Patients;

    public Department (String name, Doctor[] doctors, Nurse[] nurses, Patient[] patients)
    {
        Name = name;
        Doctors = doctors;
        Nurses = nurses;
        Patients = patients;
    }
}
