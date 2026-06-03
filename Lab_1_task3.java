import java.util.Scanner;

public class Lab_1_task3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year:");
        int y=sc.nextInt();
        {
            if(y%4==0)
                System.out.println(y+ " is a leap year");
            else
                System.out.println(y+ " is not a leap year");
        }
    }
}