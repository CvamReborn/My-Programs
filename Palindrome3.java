import java.util.*;
public class Palindrome3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(canSplitIn3Palindrome(str));
    }
    public static String canSplitIn3Palindrome(String str)
    {
        int count=0;
        StringBuilder sb=new StringBuilder();
        List<String> list=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            sb.append(str.charAt(i));
            if(sb.length()>1)
            {
                if(isPalindrome(sb.toString())) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
            else{
                if(i<str.length()-1 && str.charAt(i)!=str.charAt(i+1))
                {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        for(String s:list) count+= str.length();
        if(count!=str.length()) list.add(String.valueOf(str.charAt(str.length()-1)));
        if(list.size()>=3) return list.toString();
        System.out.println(list.toString());
        //System.out.println(sb.toString());
        return "impossible";
    }
    public static boolean isPalindrome(String str)
    {
        return str.equals(revereStr(str));
    }
    public static String revereStr(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        //System.out.println("string builder "+sb.toString());
        return sb.reverse().toString();
    }
}
