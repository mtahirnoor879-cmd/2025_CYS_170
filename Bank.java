import java.util.Scanner;
class Account
{
    double amount;
    public Account(double amount)
    {
        this.amount = amount;
    }
    void addMoney(double money)
    {
        if (money > 0)
        {
            amount += money;
            System.out.println("Money Added Successfully!");
        } else
        {
            System.out.println("Invalid Amount!");
        }
    }
    void takeMoney(double money)
    {
        if (money <= amount)
        {
            amount -= money;
            System.out.println("Money Withdrawn Successfully!");
        } else
        {
            System.out.println("Not Enough Balance!");
        }
    }
    void showAmount()
    {
        System.out.println("Available Balance: " + amount);
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Starting Balance: ");
        double startAmount = input.nextDouble();
        Account user = new Account(startAmount);
        int option;
        do {
            System.out.println("Menu");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Choose Option: ");
            option = input.nextInt();
            switch (option)
            {
                case 1:
                    System.out.print("Enter Amount to Add: ");
                    double add = input.nextDouble();
                    user.addMoney(add);
                    break;
                case 2:
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdraw = input.nextDouble();
                    user.takeMoney(withdraw);
                    break;
                case 3:
                    user.showAmount();
                    break;
                case 4:
                    System.out.println("Program Closed!");
                    break;
                default:
                    System.out.println("Wrong Choice!");
            }
        }
        while (option != 4);
        input.close();
    }
}