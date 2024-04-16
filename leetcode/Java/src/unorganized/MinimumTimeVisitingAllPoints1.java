package unorganized;

public class MinimumTimeVisitingAllPoints1 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int distance = 0;

        for(int i = 0; i < points.length - 1; i++){
            int diff = Math.max(Math.abs(points[i + 1][1] - points[i][1]),
                    Math.abs(points[i + 1][0] - points[i][0]));
            distance += diff;
        }

        return distance;
    }
}
