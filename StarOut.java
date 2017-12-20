public class StarOut {

    public static String starOut(String str) {
        String output = "";
        boolean prevStar = false;
        
        for (int i=0; i<str.length(); i++) {

            char current = str.charAt(i);

            if (current == '*' && !prevStar) {
                if (output.length() > 0) {
                    output = output.substring(0, output.length() - 1);
                }
                prevStar = true;
            } else if (current != '*') {
                if (!prevStar) {
                    output += "" + current;
                }
                prevStar = false;
            }
        }
        
        return output;
    }

    public static void main(String[] args) { 
        System.out.printf("%nStarOut for \"%s\" yields \"%s\"%n", args[0], starOut(args[0]));
    }

}