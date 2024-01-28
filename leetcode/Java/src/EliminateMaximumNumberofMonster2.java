public class EliminateMaximumNumberofMonster2 {
    public int eliminateMaximum(int[] dist, int[] speed) {
        //the difference of this one compared to solution1 is that
        // it compares how many possible monsters can be kills to
        // the cumulative monster encountered
        // this solution runs faster

        int size = dist.length;
        int encountered = 0;
        int[] eliminated = new int[size];

        for(int i = 0; i < size; i++){
            int round = (dist[i] - 1) / speed[i] + 1; // so calculate the speed, and also consider recharge time 1
            // round indicates the time it takes for certain montser to arrive
            // round is a time block, inside a time block, multiple monsters can be killed
            // and inside that time block only certain monster can be killed

            if(round >= size){ // if time needed to arrive is far away (says more than size), then ignore
                continue;
            }

            eliminated[round]++; // see how many monster could be killed at certain time
        }

        for(int i = 1; i < size; i++){ // we will kill one monster no matter what
            encountered += eliminated[i];
            if(encountered > i){
                return i; // if possible monsters we can kill is smaller than monster coming, we lose
            }
        }

        return size;
    }

}
