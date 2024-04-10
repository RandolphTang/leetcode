public class FindAllDuplicatesinanArray1 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> target = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            nums[Math.abs(nums[i]) - 1] *= -1;
            if(nums[Math.abs(nums[i]) - 1] > 0){
                target.add(Math.abs(nums[i]));
            }
        }

        return target;

    }
}
