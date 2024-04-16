package unorganized;

public class MinimumAmountofTimetoCollectGarbage1 {
    public int garbageCollection(String[] garbage, int[] travel) {
        int[] distance = new int[travel.length];
        distance[0] = travel[0];
        for(int i = 1; i < travel.length; ++i)
            distance[i] += travel[i] + distance[i - 1];

        final int ans1 = garbageCollection(garbage, distance, 'M');
        final int ans2 = garbageCollection(garbage, distance, 'G');
        final int ans3 = garbageCollection(garbage, distance, 'P');

        return ans1 + ans2 + ans3;
    }

    private int garbageCollection(String[] garbage, int[] distance, char target){
        int charCount = 0;
        int distanceIndex = -1;
        for(int i = 0; i < garbage.length; ++i) {
            final String assigned = garbage[i];
            if(assigned.chars().anyMatch(g -> g == target)) {
                distanceIndex = i;
                charCount += (int)assigned.chars().filter(g -> g == target).count();
            }


        }

        return  charCount + (distanceIndex <= 0 ? 0 : distance[distanceIndex - 1]);
    }
}
