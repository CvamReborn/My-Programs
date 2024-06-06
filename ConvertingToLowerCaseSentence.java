public class ConvertingToLowerCaseSentence {
    public static void main(String[] args) {
        System.out.println(convertToLowerCase("RamIsGoodBoy"));
    }
    public static String convertToLowerCase(String s)
    {
        s=s.trim();
        StringBuilder sb=new StringBuilder();
        sb.append(Character.toLowerCase(s.charAt(0)));
        for(int i=1;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                sb.append(" ");
            }
            sb.append(Character.toLowerCase(s.charAt(i)));
        }
        return sb.toString();
    }
}
