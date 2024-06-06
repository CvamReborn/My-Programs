import java.util.HashMap;
import java.util.Map;

public class LargestWordInString {
    public static void main(String[] args) {
        //System.out.println(findLargestWord("ram is good person"));
        System.out.println(findUsingTwoPointer("ramdimf goods is good person"));
    }

    public static String findUsingTwoPointer(String sentence)
    {
        StringBuffer sb=new StringBuffer();
        int large=Integer.MIN_VALUE;
        int i=0;int j=1;
        while(j<sentence.length())
        {
            if(j==sentence.length()-1)
            {
                if(large<(j-i+1))
                {
                    sb.setLength(0);
                    sb.append(sentence.substring(i,j+1));
                }
            }
            else
            {
                if(sentence.charAt(j)==' ')
                {
                    if(large<(j-i))
                    {
                        sb.setLength(0);
                        large=j-i;
                        sb.append(sentence.substring(i,j));
                    }
                    i=j+1;
                }
            }
            j++;
        }
        return sb.toString();
    }
    public static String findLargestWord(String sentence)
    {
        HashMap<String,Integer> map=new HashMap<>();
        String[] words=sentence.split(" ");
        for(String word:words) map.put(word,word.length());
        int large=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            if(large<entry.getValue())
            {
                large=entry.getValue();
                sentence=entry.getKey();
            }
        }
        return sentence;
    }
}
