package unorganized;

public class DetermineifaCellIsReachableataGivenTime {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int abs_distance_x = Math.abs(fx - sx);
        int abs_distance_y = Math.abs(fy - sy);

        if(abs_distance_x == 0 && abs_distance_y == 0) return t != 1; // edge case, if move 1, no way to come back
        // if t=0, not move, still arrive
        // greater than 1, still a way to be back

        if(abs_distance_x <= t && abs_distance_y <= t) return true;

        return false;
    }
}
