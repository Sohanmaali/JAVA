public class Test {
    public static void main(String[] args) {
        // Lambda expression to add two numbers
        MathOperation addition = (int a, int b) -> {

            if (a == 5) {
                throw new NullPointerException();
            }
            return a + b;
        };
        // Using the lambda expression to add two numbers
        int result = addition.operate(8, 3);
        System.out.println("Result: " + result);
    }
}

// Lambda expression to represent a function that adds two numbers
interface MathOperation {
    int operate(int a, int b);
}
