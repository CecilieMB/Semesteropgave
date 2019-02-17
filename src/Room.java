import java.lang.reflect.Array;

public class Room
{
    public int RoomID;
    public Bed[] Beds;

    public Room (int roomid, Bed[] beds)
    {
        RoomID = roomid;
        Beds = beds;
    }
}
