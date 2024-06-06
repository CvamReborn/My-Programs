import java.util.regex.*;
public class DateOfBirthExtract {
    public static void main(String[] args) {
        String s="Hey, i am 24 years old and my date of birth is 2000-3-20. This is good day.";
        System.out.println(dateExtractor(s));
    }
    public static String dateExtractor(String input)
    {
        //String exp="\\d{1,2}-\\d{1,2}-\\d{4}";
        String exp="(?=.*[0-9]{4})(?=.*[0-9]{1,2})(?=.*[0-9]{1,2})[0-9\\-]{8,}";
        Pattern pattern=Pattern.compile(exp);
        Matcher matcher=pattern.matcher(input);
        if(matcher.find()) return matcher.group();
        else return "No!!";
    }
}
