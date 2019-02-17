import java.lang.reflect.Array;

public class Hall
{
    public String HallName;
    public String Department;
    public Room[] Rooms;

    public Hall (String hallname, String department, Room[] rooms)
    {
        HallName = hallname;
        Department = department;
        Rooms = rooms;
    }
}
