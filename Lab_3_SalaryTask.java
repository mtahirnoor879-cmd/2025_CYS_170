import java.util.Scanner;
public class Lab_3_SalaryTask{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float monthly_salary, portion_saved, total_cost, portion_down_payment = 0.25f, r = 0.05f, current_saving = 0;
        int months = 0;
        {
            System.out.println("Monthly salary:");
            monthly_salary = sc.nextFloat();
            System.out.println("Portion of salary to save (e.g. 0.15 for 15%):");
            portion_saved = sc.nextFloat();
            System.out.println("Total cost of your dream asset:");
        }
        total_cost = sc.nextFloat();
        float down_payment = total_cost * portion_down_payment;
        while (current_saving < down_payment) {
            current_saving += current_saving * r / 12;
            current_saving += monthly_salary * portion_saved;
            months++;
        }
        {
            System.out.println("Months needed to save for down payment: " + months);
        }
    }
}
