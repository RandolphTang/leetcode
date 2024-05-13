package May.MeetingRooms;

public class Solution2 {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> {
            return i1[0] - i2[0];
        });

        int endTime = Integer.MIN_VALUE;

        for(int[] each: intervals){
            if(each[0] >= endTime) endTime = each[1];
            else return false;
        }

        return true;
    }
}
