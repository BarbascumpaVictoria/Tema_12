
public class Main {
    public static void main(String[] args) {
   Training t1 = new Programmer("Ion", 25);
        Training t2= new Manager("Andrei", 35);
        Training t3= new Programmer("Nicolae", 32);
        Training t4= new Manager("Vlad", 42);

       MeetingRoom meetingRoom = new MeetingRoom();
       meetingRoom.join(new Training[]{t1, t2, t3, t4});
        }
    }
