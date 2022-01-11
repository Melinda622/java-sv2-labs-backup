package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom m : meetingRooms) {
            System.out.println(m.getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames() {
        for (int i = 1; i < meetingRooms.size(); i = i + 2) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas() {
        StringBuilder data = new StringBuilder();
        for (MeetingRoom m : meetingRooms) {
            data.append("\nMeeting room's name: ");
            data.append(m.getName() + ", ");
            data.append("Meeting room's width: ");
            data.append(m.getWidth() + ", ");
            data.append("Meeting room's length: ");
            data.append(m.getLength() + ", ");
            data.append("Meeting room's area: ");
            data.append(m.getArea());
        }
        System.out.println(data.toString());
    }

    public void printMeetingRoomsWithName(String name) {
        StringBuilder data2 = new StringBuilder();
        String result = "";
        for (MeetingRoom m : meetingRooms) {
            if (name.equalsIgnoreCase(m.getName())) {
                data2.append("Meeting room's width: ");
                data2.append(m.getWidth() + ", ");
                data2.append("Meeting room's length: ");
                data2.append(m.getLength() + ", ");
                data2.append("Meeting room's area: ");
                data2.append(m.getArea());
                System.out.println(data2.toString());
            }
        }
        if (data2.toString().equals("")) {
            result = "Nincs találat.";
        }
        System.out.println(result);
    }

    public void printMeetingRoomsContains(String part) {
        StringBuilder data3 = new StringBuilder();
        String result = "";
        for (MeetingRoom m : meetingRooms) {
            if (m.getName().contains(part.trim().toLowerCase())) {
                data3.append("\nMeeting room's width: ");
                data3.append(m.getWidth() + ", ");
                data3.append("Meeting room's length: ");
                data3.append(m.getLength() + ", ");
                data3.append("Meeting room's area: ");
                data3.append(m.getArea());
            }
        }
        System.out.println(data3.toString());
        if (data3.toString().equals("")) {
            result = "Nincs találat.";
        }
        System.out.println(result);
    }


    public void printAreasLargerThan(int area) {
        StringBuilder data4 = new StringBuilder();
        String result = "";
        for (MeetingRoom m : meetingRooms) {
            if (area < m.getArea()) {
                data4.append("\nMeeting room's name: ");
                data4.append(m.getName() + ", ");
                data4.append("Meeting room's width: ");
                data4.append(m.getWidth() + ", ");
                data4.append("Meeting room's length: ");
                data4.append(m.getLength() + ", ");
                data4.append("Meeting room's area: ");
                data4.append(m.getArea());
            }
        }
        System.out.println(data4.toString());
        if (data4.toString().equals("")) {
            result = "Nincs találat.";
        }
        System.out.println(result);
    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }
}
