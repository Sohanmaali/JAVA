import java.util.Scanner;

class InsertElementInArray {
    public static void main(String[] args) {
        int arry[] = new int[100];
        int Size = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter array element");
        for (int i = 0; i < Size; i++) {
            arry[i] = sc.nextInt();
        }
        System.out.println("enter index");
        int index = sc.nextInt();
        if (index >= Size) {
            System.out.println("Please insert valide index");
            return;
        } else {

            System.out.println("enter value");
            int value = sc.nextInt();
            for (int i = Size-1; i >= index; i--) {
                arry[i + 1] = arry[i];
                if (index == i) {
                    arry[index] = value;
                    Size++;
                    break;
                }
            }
        }
        for (int i = 0; i < Size; i++) {
            System.out.print(arry[i] + " ");
        }
        // sc.close();
    }
}