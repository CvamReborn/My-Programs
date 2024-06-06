public class RemoveBracketsFromExpression {
    public static void main(String[] args) {
        System.out.println(removeBrackets("(a+b)(c+d)"));
    }
    public static String removeBrackets(String expression)
    {
        StringBuffer sb=new StringBuffer();
        for(char ch:expression.toCharArray()) {
            if (ch != '(' && ch != ')') sb.append(ch);
        }
        return sb.toString();
    }
}
