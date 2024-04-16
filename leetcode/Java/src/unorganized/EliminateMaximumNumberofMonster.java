package unorganized;

public class EliminateMaximumNumberofMonster {
    public int eliminateMaximum(int[] dist, int[] speed) {
        // this problem basically asks for time ratio

        int n = dist.length;
        int[] arrTime = new int[n];

        for(int i = 0; i < n; i++) {
            arrTime[i] = (dist[i] - 1) / speed[i];
            //dist[i] - 1 because we consider loss when monster reaches
            //even fully charged
        }

        Arrays.sort(arrTime);
        //gets the priority of monster will arrive first

        for(int i = 0; i < n; i++) {
            if(i > arrTime[i]) { // think i as time, says i = 0 (right now), and first
                                //monster will arrive right now (i = 0) or later
                                // so we can sure kill first monster
                                // if the second monster arrived before recharge, the kill is minimum 1
                return i; // number of monster killed
            }
        }

        return n; // all monster killed

    }
}
