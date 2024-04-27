public class Upper_Word {

  public static void main(String[] args) {
    String s = "sohan maali indore";
    String[] words = name.split(" ");
    StringBuilder result = new StringBuilder();

    for (String word : words) {
      result
        .append(Character.toUpperCase(word.charAt(0)))
        .append(word.substring(1))
        .append(" ");
    }
    System.out.println(result.toString());
  }
}
