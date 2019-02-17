public class Bed
{
    public int BedID;
    public boolean IsClean;
    public Patient Patient;

    public Bed (int bedid, boolean isClean, Patient patient)
    {
        BedID = bedid;
        IsClean = isClean;
        Patient = patient;
    }
}
