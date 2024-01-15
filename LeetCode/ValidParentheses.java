public class ValidParentheses {

     public static boolean isValid(String s) {
          boolean flag = false;
          for (int i = 0; i < s.length(); i += 2) {
               flag = false;
               if ((s.charAt(i) == '(' && s.charAt(i + 1) == ')') || (s.charAt(i) == '{' && s.charAt(i + 1) == '}')
                         || (s.charAt(i) == '[' && s.charAt(i + 1) == ']')) {
                    flag = true;
               }
          }
          return flag;
     }

     public static void main(String[] args) {
          System.out.println(ValidParentheses.isValid("){}[]"));
     }
}