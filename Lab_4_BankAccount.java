import java.util.Scanner;
public class Lab_4_BankAccount
{
    int saving_account = 0;
    void deposit(int amount)
    {
        saving_account += amount;
        System.out.println("Amount Deposited: " + amount);
    }
    void withdraw(int amount)
    {
        if (amount <= saving_account)
        {
            saving_account -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Insufficient Balance!");
        }
    }
    void checkBalance()
    {
        System.out.println("Current Balance: " + saving_account);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Lab_4_BankAccount obj = new Lab_4_BankAccount();
        int choice;
        do
        {
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    obj.deposit(sc.nextInt());
                    break;
                case 2:
                    obj.withdraw(sc.nextInt());
                    break;
                case 3:
                    obj.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid CHOICE");
            }
        } while (choice != 4);
        sc.close();
    }
}