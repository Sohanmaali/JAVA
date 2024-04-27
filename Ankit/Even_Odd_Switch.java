public class Even_Odd_Switch {
    public static void main(String[] args) {
        switch (11 % 2) {
            case 0:
                System.out.println("Even Number");
                break;

            case 1:
                System.out.println("Odd Number");
                break;

            default:
                break;
        }
    }
}
