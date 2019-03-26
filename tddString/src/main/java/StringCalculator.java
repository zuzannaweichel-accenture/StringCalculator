import java.util.Arrays;

public class StringCalculator {
    public int add(String s) {
        int result = 0;
        String[]nums;
        if (s.length() == 0) {
            return result;
        }
        String[] elements = s.split("");
        if (elements.length > 1 && (elements[0].equals("/") && elements[1].equals("/"))){
            String delim = elements[2];
            nums = s.substring(s.indexOf("\n")+1).split(delim);
        }else{
            nums = s.split(",|\n");
            StringBuilder negatives = new StringBuilder();
                for (String str : nums) {
                    if (Integer.parseInt(str) < 0){
                       negatives.append(" "+str);
                    }
                }
            if (negatives.toString().length()>0){
                throw new IllegalArgumentException("negatives not allowed"+negatives.toString());
            }

        }
            for (String str: nums) {
                result += Integer.parseInt(str);
            }
        return result;
    }
}
