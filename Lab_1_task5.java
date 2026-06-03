import java.util.Scanner;

public class Lab_1_task5
{
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number:");
        int div = n.nextInt();
        int count = 0;
        if (div < 0)
            System.out.println("Illegal input");
        else
        {
            while (div != 1) {
                div = div / 2;
                count += 1;
            }
            System.out.println(count);
        }
    }
}