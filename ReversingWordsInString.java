public class ReversingWordsInString {
    public static void main(String[] args) {
        String s="ram is good boy";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s)
    {
        String[] words=s.split(" ");
        int start=0;
        int end=words.length-1;
        while(start<end)
        {
            String temp=words[start];
            words[start]=words[end];
            words[end]=temp;
            start++;
            end--;
        }
        StringBuffer sb=new StringBuffer();
        for(String st:words) sb.append(st).append(" ");
        return sb.toString();
    }
}
