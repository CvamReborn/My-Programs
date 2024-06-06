import java.util.ArrayList;
import java.util.HashMap;

class SumOfBeautifulString {
    public static void main(String[] args) {
       String s="tfpizfxhzaxwhdqkbpaxoozjzkswsvebbfvfpffvozjqwjxlukoenqlhisoqxhcuvxcwjnziuigzxzcfuaigcmcqolotcnsdozmpndnuwvxjvvnnnmjprgnjjzszqynffxwmjpeampodrxweoejtznpbllrnvjjdlyxrgsnzaodrzlieumealaegksejxlxhrwjwovwekgyopbrwjnwtxpdedqyuwjnnadejtvsodwkhciwdyxbyjcarxxecyzigyfylfezfiewysfeybvqifqiwasuybxsfccavioffieosofisywofdwktafemsvmxdqwxjcbinzsjgshptrsiqqyjdqkjbyuap";
        System.out.println(beautySum(s));
    }
    public static int beautySum(String s) {
        int beautySum=0;
        ArrayList<String> megaList=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            megaList.addAll(findAllSubString(i,s));
        }
        for(String str:megaList) beautySum=beautySum+findBeauty(str);
        //System.out.print(megaList);
        return beautySum;
    }
    public static ArrayList<String> findAllSubString(int start,String s)
    {
        /*ArrayList<String> list=new ArrayList<>();
        StringBuffer sb=new StringBuffer();
        for(int i=1;i<s.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                sb.append(s.charAt(j));
            } list.add(sb.toString());
            sb.setLength(0);
        }*/
        ArrayList<String> list=new ArrayList<>();
        for(int i=start+1;i<=s.length();i++)
        {
            list.add(s.substring(start,i));
        }
        return list;
    }
    public static int findBeauty(String s)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(char key:map.keySet())
        {
            small=small>map.get(key)?map.get(key):small;
            large=large<map.get(key)?map.get(key):large;
        }
        return large-small;
    }
}