package unorganized;

public class MinimumAmountofTimetoCollectGarbage2 {
    public int garbageCollection(String[] garbage, int[] travel) {
        int result = 0;

        for(int i = 0; i < travel.length; i++) {
            result += 3 * travel[i];
        }

        for(int i = 0; i < garbage.length; i++) {
            result += garbage[i].length();
        }

        result = garbageNoCollection(garbage, travel, result, 'G');
        result = garbageNoCollection(garbage, travel, result, 'P');
        result = garbageNoCollection(garbage, travel, result, 'M');

        return result;
    }

    private int garbageNoCollection(String[] garbage, int[] travel, int result, char target) {

        for(int i = garbage.length - 1; i > 0; i--) {
            if(garbage[i].indexOf(target) == -1) {
                result -= travel[i - 1];
            } else {
                break;
            }
        }

        return result;
    }
}
