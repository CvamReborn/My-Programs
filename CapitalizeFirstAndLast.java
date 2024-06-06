public class CapitalizeFirstAndLast {
    public static void main(String[] args) {
        String s="ram is good boy";
        System.out.println(firstAndLastLetterOfWord(s));
        System.out.println(anotherWay(s));
    }
    public static String anotherWay(String s)
    {
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<sb.length();i++)
        {
            if(i==0 || i==sb.length()-1) sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            else if(sb.charAt(i)==' ')
            {
                sb.setCharAt(i-1,Character.toUpperCase(sb.charAt(i-1)));
                sb.setCharAt(i+1,Character.toUpperCase(sb.charAt(i+1)));
            }
        }
        return sb.toString();
    }
    public static String firstAndLastLetterOfWord(String s)
    {
        String[] sentence=s.split(" ");
        StringBuffer sb=new StringBuffer();
        int position=0;
        for(String word: sentence)
        {
            for(char ch:word.toCharArray())
            {
                if(position==0) sb.append(Character.toUpperCase(ch));
                else if(position==word.length()-1) sb.append(Character.toUpperCase(ch));
                else sb.append(ch);
                position++;
            }
            position=0;
            sb.append(" ");
        }
        return sb.toString();
    }
}
