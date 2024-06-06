import java.util.regex.*;
public class RegularExpression {
    public static void main(String[] args) {
        String input="this is my email id: coolshivam.190@gmail.com randi MERPS5217M8 ka baccha +91-6206495281...";
        System.out.println(findPan(input));
    }
    public static String findPan(String str)
    {
        String panPattern="[A-Z]{5}\\d{4}[A-Z]{1}";
        Pattern pattern=Pattern.compile(panPattern);
        Matcher matcher=pattern.matcher(str);
        if(matcher.find()) return "Pan: "+matcher.group();
        else return "No pan number found randi.";
    }
    public static String findEmail(String str){
        String emailPattern="[a-zA-Z0-9.$_]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}";
        Pattern pattern=Pattern.compile(emailPattern);
        Matcher matcher=pattern.matcher(str);
        if(matcher.find()) return "Email:"+matcher.group();
        else return "No matching string found";
    }
    public static String findMobileNumber(String str)
    {
        String mobilePattern="\\+[0-9]{2,}-[0-9]{10,}";
        Pattern pattern=Pattern.compile(mobilePattern);
        Matcher matcher=pattern.matcher(str);
        if(matcher.find()) return "Mobile Number:"+matcher.group();
        else return "No matching string found";
    }




}
