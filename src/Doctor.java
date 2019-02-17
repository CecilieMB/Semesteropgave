public class Doctor extends Nurse
{
    public String Titel;

    public Doctor (String name, long id, String department, String titel)
    {
        super(name, id, department);
        Titel = titel;
    }
}

