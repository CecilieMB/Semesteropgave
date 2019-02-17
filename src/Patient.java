public class Patient extends PersonalInfo
{
    public int AdmissionDate;

    public Patient (String name, long id, int admissiondate)
    {
        super(name, id);
        AdmissionDate = admissiondate;
    }
}
