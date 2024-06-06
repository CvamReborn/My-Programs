import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncodedText {
    public static void main(String[] args)
    {
        if(isValidPassword("abccccccccccc45!@#$"))
        {
            System.out.println("yes");
            System.out.println(encryptPassword("AqrtT119%",4));
        }
        else System.out.println("no");
    }
    public static String encryptPassword(String password,int shift)
    {
        StringBuilder sb=new StringBuilder();
        for(char ch:password.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                if((int)ch-shift<65) sb.append((char)((int)ch+26-shift));
                else sb.append((char)((int)ch-shift));
            }
            else if(Character.isLowerCase(ch))
            {
                if((int)ch-shift<97) sb.append((char)((int)ch+26-shift));
                else sb.append((char)((int)ch-shift));
            }
            else if(Character.isDigit(ch))
            {
                if((int)ch-shift<48) sb.append((char)((int)ch+10-shift));
                else sb.append((char)((int)ch-shift));
            }
            else sb.append((char)((int)ch-shift));
        }
        return sb.toString();
    }
    public static boolean isValidPassword(String password)
    {
        String passwordPattern="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[$%#@!]).{8,}$";
        Pattern pattern=Pattern.compile(passwordPattern);
        Matcher matcher=pattern.matcher(password);
        return matcher.matches();
    }
    /*public static boolean isValidPassword(String password)
    {
        ArrayList<Character> list=new ArrayList<>();
        for(char ch:password.toCharArray()) list.add(ch);
        boolean flag=false;
        if(list.size()<8) return false;
        for(char ch:list)
        {
            if(Character.isUpperCase(ch))
            {
                flag=true;
                break;
            }
        }
        if(!flag) return false;
        flag=false;
        for(char ch:list)
        {
            if(Character.isLowerCase(ch))
            {
                flag=true;
                break;
            }
        }
        if(!flag) return false;
        flag=false;
        for(char ch:list)
        {
            if(Character.isDigit(ch))
            {
                flag=true;
                break;
            }
        }
        if(!flag) return false;
        flag= list.contains('@') || list.contains('#');
        return flag;
    }*/
}
