import java.util.Scanner;

public class Lab_1_task4
{
    static void main(String[] args)
    {
        Scanner b=new Scanner(System.in);
        System.out.println("Enter unit consumed:");
        int u=b.nextInt();
        int bill;
        {
            if(u<=100)
            {
                bill=u*5;
            }
            else if(u<=200)
            {
                bill=100*5+(u-100)*7;
            }
            else
            {
                bill=100*5+100*7+(u-200)*15;
            }
            System.out.println("Bill is " +bill);
        }
    }
}