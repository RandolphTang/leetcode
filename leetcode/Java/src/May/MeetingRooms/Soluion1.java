package May.MeetingRooms;

public class Soluion1 {
    public boolean canAttendMeetings(int[][] intervals) {

        int[] frame = new int[1000001];

        for(int[] each: intervals){
            for(int i = each[0]; i < each[1]; i++){
                if(frame[i] == 1) return false;
                frame[i] = 1;
            }
        }

        return true;

    }
}
