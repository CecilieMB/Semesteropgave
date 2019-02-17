import java.lang.reflect.Array;

public class Main {


    public static void main(String[] args)
    {
        Nurse nurse1 = new Nurse("Mette", 8765, "Cardiology");
        Nurse nurse2 = new Nurse ("Hans", 8723, "Cardiology");
        Nurse[] nurses1 = {nurse1, nurse2};

        Doctor doctor1 = new Doctor ("Peter",3856, "Cardiology", "Fellow");
        Doctor doctor2 = new Doctor ("Hanne", 3812, "Cardiology", "Resident");
        Doctor[] doctors1 = {doctor1, doctor2};

        Patient patient1 = new Patient ("Carl",1408597531L, 16022019);
        Patient patient2 = new Patient ("Jens",3112995123L, 14022019);
        Patient patient3 = new Patient ("Linda",2804870024L, 15022019);
        Patient[] patients1 = {patient1, patient2, patient3};

        Department cardiology = new Department("Cardiology",doctors1, nurses1, patients1);

        Bed bed11 = new Bed(1, true, patient1);
        Bed bed12 = new Bed (2, false, patient2 );
        Bed bed13 = new Bed (3, true, null);
        Bed[] beds1 = {bed11, bed12, bed13};

        Bed bed21 = new Bed (1,true, patient3);
        Bed[] beds2 = {bed21};

        Room room1 = new Room (0, beds1);
        Room room2 = new Room (1, beds2);
        Room[] rooms1 = {room1, room2};

        Hall hallA = new Hall ("Ward A","Cardiology", rooms1);

        for (int i = 0; i < hallA.Rooms.length; i++)
        {
            Room room = hallA.Rooms[i];
            System.out.println("this is room nr." + (room.RoomID + 1));

            for (int y = 0; y < room.Beds.length; y++)
            {
                Bed bed = room.Beds[y];
                System.out.println("This is bed nr. " + bed.BedID);
            }
        }

        System.out.println(cardiology.Doctors);
        System.out.println(cardiology.Nurses);
        System.out.println(cardiology.Patients);
    }
}
