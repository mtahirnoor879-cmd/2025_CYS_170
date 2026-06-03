import java.util.Scanner;

public class Lab_1_task6
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a number:");
        int r=a.nextInt();
        int reverse=0;
        while(r!=0)
        {
            int d=r%10;
            reverse=reverse*10+d;
            r=r/10;
        }
        {
            System.out.println(reverse);
        }
    }
}