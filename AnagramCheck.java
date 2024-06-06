import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println(isAnagram("ram","arm"));}
    public static boolean isAnagram(String word1,String word2)
    {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<word1.length();i++) map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i),0)+1);
        for(int i=0;i<word2.length();i++) map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i),0)+1);
        return map1.equals(map2);

    }

}
