import java.util.Scanner;

public class Lab_1_task1
{
    public static void main(String []args)
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=a.nextInt();
        if (n<0)
        {
            System.out.println("You enter a negative number");
        }
        else if(n==0)
        {
            System.out.println("Factorial of 0 is 1");
        }
        else
        {
            int fac=1;
            for (int i=1; i<=n; i++)
                fac = fac * i;
            System.out.println("Factorial of " +n +" is " +fac);
        }
    }
}
