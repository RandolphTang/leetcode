package unorganized;

public class MaximalRectangle1 {
    public int maximalRectangle(char[][] matrix) {

        if (matrix.length == 0){
            return 0;
        }

        int currentM = 0;
        int[] eachRow = new int[matrix[0].length];

        for(char[] eachRow2: matrix){
            for(int i = 0; i < eachRow2.length; i++){
                eachRow[i] = eachRow2[i] == '0'? 0 : eachRow[i] + 1;
            }

            currentM = Math.max(calculateMaxHist(eachRow), currentM);
        }

        return currentM;
    }

    private int calculateMaxHist(int[] eachRow){
        int res = 0;
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i <= eachRow.length; i++){
            while(!s.isEmpty() && (i == eachRow.length || eachRow[s.peek()] > eachRow[i])){
                final int height = eachRow[s.pop()];
                final int width = s.isEmpty()? i : i - s.peek() - 1;
                res = Math.max(res, (height * width));
            }
            s.push(i);
        }

        return res;


    }
}
