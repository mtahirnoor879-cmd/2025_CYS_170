import java.util.Scanner;

public class Lab_1_task2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter starting value:");
        int x = a.nextInt();
        System.out.println("You entered " + x);
        Scanner b = new Scanner(System.in);
        System.out.println("Enter ending value");
        int y = b.nextInt();
        if (y < x) {
            for (int i = y; i <= x; i++) {
                System.out.print(i + " ");
            }
        } else if (y > x) {
            for (int i = y; i >= x; i--) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print(b);
        }
    }
}