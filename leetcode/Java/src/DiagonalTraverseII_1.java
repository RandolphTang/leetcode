public class DiagonalTraverseII_1 {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int count = 0;
        List<List<Integer>> arranged = new ArrayList<>();

        for(int i = 0; i < nums.size(); i++){
            List<Integer> row = nums.get(i);

            for(int j = 0; j < row.size(); j++){
                int index = j + i;
                if(arranged.size() < index + 1) arranged.add(new ArrayList<>());
                arranged.get(index).add(row.get(j));
                count++;
            }

        }

        int[] ans = new int[count];
        int index = 0;
        for(List<Integer> list: arranged){

            for(int j = list.size() - 1; j >= 0; j--){
                ans[index++] = list.get(j);
            }

        }

        return ans;
    }
}
