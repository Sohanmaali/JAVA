public class Second_Max {

  public static int findSecondMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int num : arr) {
      if (num > max) {
        secondMax = max;
        max = num;
      } else if (num > secondMax && num != max) {
        secondMax = num;
      }
    }

    return secondMax;
  }

  public static void main(String[] args) {
    int[] arr = { 18, 5, 20, 8, 15 };
    int secondMax = findSecondMax(arr);
    System.out.println("Second maximum element in the array: " + secondMax);
  }
}
