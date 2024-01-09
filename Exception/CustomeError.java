public class CustomeError {

     public static void main(String[] args) {

          String s = "sohan";
          System.out.println(s.substring(2, 3));// try {
          // throw new OutOfMemoryError("This is a custom error.");
          // } catch (CustomError e) {
          // System.out.println("Caught CustomError: " + e.getMessage());
          // }
     }

     static class CustomError extends Error {
          public CustomError(String message) {
               super(message);
          }
     }
}
