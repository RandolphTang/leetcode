public class ZigZagconversion {

    public String convert(String s, int numRows) {

        //this problem just require us to consider two main scenarios
        // and two sub scenarios

        // First main: when it is the first and end line
        // Second main: middle lines
        // Second main $ first sub: when no gap
        // Second main $ second sub: when there is a gap

        // so we set up a J to track each line formation
        // i to track every line formation

        if(numRows == 1) {
            return s;  // the special scenario when there is only one row required to form
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numRows; i++) {
            int j = i;
            if(i == 0 || i == numRows - 1 ) {
                while(j < s.length()) { // finish first line formation until end
                    sb.append(s.charAt(j));
                    j += 2 * (numRows - 1);
                }
            } else { // middle lines formation
                boolean turningP = false;
                while(j < s.length()){
                    if(!turningP) { // consider the two sub scenarios
                        sb.append(s.charAt(j));
                        j += 2 * (numRows - i - 1);
                        turningP = true;
                    } else {
                        sb.append(s.charAt(j));
                        j += 2 * i;
                        turningP = false;
                    }
                }
            }
        }

        return sb.toString();
    }
}
