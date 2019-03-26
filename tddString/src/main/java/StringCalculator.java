import java.util.Arrays;

public class StringCalculator {
    public int add(String s) {
        int result = 0;
        String[]nums;
        if (s.length() == 0){
            return result;
        }else {
            if ( s.length() > 1 && s.substring(0,2).equals("//")){
                String delim = s.substring(2,3);
                nums = s.split(delim);
            }else{
                nums = s.split(",|\n");
            }

            for (String str: nums) {
                result += Integer.parseInt(str);
            }
        }
        return result;
    }
}
