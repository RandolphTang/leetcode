package unorganized;

public class FindAllDuplicatesinanArray2 {
    public List<Integer> findDuplicates(int[] nums) {
        int[] l = new int[nums.length + 1];
        List<Integer> al =  new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            l[nums[i]]++;
        }

        for(int i = 1; i < l.length; i++){
            if(l[i] > 1){

                al.add(i);
            }
        }

        return al;
    }
}
