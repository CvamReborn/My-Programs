public class NextLexicographicLetter {
    public static void main(String[] args) {
        System.out.println(nextLexiLetterWord("Java"));//Kbub
    }
    public static String nextLexiLetterWord(String s)
    {
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                if(s.charAt(i)==90) sb.setCharAt(i,'A');
                else sb.setCharAt(i,(char)((int)s.charAt(i)+1));
            }
            else
            {
                if(s.charAt(i)==122) sb.setCharAt(i,'a');
                else sb.setCharAt(i,(char)((int)s.charAt(i)+1));
            }
        }
        return sb.toString();
    }
}
