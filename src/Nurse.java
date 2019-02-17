public class Nurse extends PersonalInfo
{
    public String Department;

    public Nurse(String name, long id, String department)
    {
        super(name, id);
        Department = department;
    }
}

