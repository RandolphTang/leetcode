public class ZigZagconversion2 {
    public String convert(String s, int numRows) {
        int main = (numRows - 1) * 2;
        int index = 0;
        char[] ans = new char[s.length()];

        if(numRows == 1 || s.length() < numRows){
            return s;
        }

        for(int i = 0; i < numRows; i++){
            int sub = main - 2 * i;
            for(int j = i; j < s.length(); j += main){
                ans[index++] = s.charAt(j);
                if(sub < main && sub > 0 && j + sub < s.length() && index < s.length()){
                    ans[index++] = s.charAt(j + sub); // if space existed between value in the same row
                                                        // use sub to increment to trace next target
                                                        // does not affect current value of j
                                                        // (j) which helps traces next value with constant main steps
                }

            }
        }

        return new String(ans);
    }
}
