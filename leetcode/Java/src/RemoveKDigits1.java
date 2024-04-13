public class RemoveKDigits1 {
    public String removeKdigits(String num, int k) {
        LinkedList<Character> l = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        if(k == num.length()){
            return "0";
        }

        for(int i = 0; i < num.length(); i++){
            while(!l.isEmpty() && k > 0 && l.getLast() > num.charAt(i)){
                l.pollLast();
                k--;
            }

            l.addLast(num.charAt(i));

        }

        while(k > 0){
            l.pollLast();
            k--;
        }

        for(char c: l){
            if(c == '0' && sb.length() == 0){
                continue;
            }
            sb.append(c);
        }

        return sb.length() == 0 ? "0" : sb.toString();

    }
}
