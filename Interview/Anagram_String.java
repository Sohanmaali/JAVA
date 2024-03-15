public class Anagram_String {

  public static void main(String[] args) {
    String s1 = "sldkkfjkdjdf";
    String s2 = "sdkfjkdjdkf";

    if (areAnagrams(s1, s2)) {
      System.out.println("Anagram");
      return;
    }
    System.out.println("not Anagram");
  }

  public static boolean areAnagrams(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    char c1[] = s1.toCharArray();
    char c2[] = s2.toCharArray();

    c1 = sort(c1);
    c2 = sort(c2);
    for (int i = 0; i < c2.length; i++) {
      if (c1[i] != c2[i]) {
        return false;
      }
    }
    return true;
  }

  public static char[] sort(char c[]) {
    for (int i = 0; i < c.length; i++) {
      for (int j = 0; j < c.length - i - 1; j++) {
        if (c[j] > c[j + 1]) {
          char ch = c[j];
          c[j] = c[j + 1];
          c[j + 1] = ch;
        }
      }
    }
    return c;
  }
}
