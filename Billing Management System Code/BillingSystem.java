import java.io.*;
import java.util.*;

// -------------------- CUSTOMER CLASS --------------------
class Customer {
    private int id;
    private String name;
    private String phone;

    public Customer(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public String toString() {
        return id + "," + name + "," + phone;
    }
}

// -------------------- BILL CLASS --------------------
class Bill {
    protected int billId;
    protected int customerId;
    protected double amount;

    public Bill(int billId, int customerId, double amount) {
        this.billId = billId;
        this.customerId = customerId;
        this.amount = amount;
    }

    public double getAmount() { return amount; }
    public int getBillId() { return billId; }

    public String toString() {
        return billId + "," + customerId + "," + amount;
    }
}

// -------------------- INHERITANCE --------------------
class DepartmentBill extends Bill {
    private String department;

    public DepartmentBill(int billId, int customerId, double amount, String department) {
        super(billId, customerId, amount);
        this.department = department;
    }

    public String toString() {
        return billId + "," + customerId + "," + amount + "," + department;
    }
}

// -------------------- PAYMENT CLASS --------------------
class Payment {
    private int billId;
    private double paidAmount;

    public Payment(int billId, double paidAmount) {
        this.billId = billId;
        this.paidAmount = paidAmount;
    }

    public String toString() {
        return billId + "," + paidAmount;
    }
}

// -------------------- MAIN SYSTEM --------------------
public class BillingSystem {

    static Scanner sc = new Scanner(System.in);

    // -------------------- ADD CUSTOMER --------------------
    static void addCustomer() throws IOException {
        FileWriter fw = new FileWriter("customers.txt", true);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        Customer c = new Customer(id, name, phone);
        fw.write(c.toString() + "\n");
        fw.close();

        System.out.println("Customer Added!");
    }

    // -------------------- GENERATE BILL --------------------
    static void generateBill() throws IOException {
        FileWriter fw = new FileWriter("bills.txt", true);

        System.out.print("Enter Bill ID: ");
        int billId = sc.nextInt();

        System.out.print("Enter Customer ID: ");
        int custId = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        DepartmentBill b = new DepartmentBill(billId, custId, amount, dept);
        fw.write(b.toString() + "\n");
        fw.close();

        System.out.println("Bill Generated!");
    }

    // -------------------- RECORD PAYMENT --------------------
    static void recordPayment() throws IOException {
        FileWriter fw = new FileWriter("payments.txt", true);

        System.out.print("Enter Bill ID: ");
        int billId = sc.nextInt();

        System.out.print("Enter Paid Amount: ");
        double amount = sc.nextDouble();

        Payment p = new Payment(billId, amount);
        fw.write(p.toString() + "\n");
        fw.close();

        System.out.println("Payment Recorded!");
    }

    // -------------------- VIEW FILE --------------------
    static void viewFile(String filename) throws IOException {
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("No records found.");
            return;
        }

        Scanner fileReader = new Scanner(file);
        while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
        }
        fileReader.close();
    }

    // -------------------- MAIN --------------------
    public static void main(String[] args) throws IOException {

        int choice;

        do {
            System.out.println("\n--- Departmental Billing System ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Generate Bill");
            System.out.println("3. Record Payment");
            System.out.println("4. View Customers");
            System.out.println("5. View Bills");
            System.out.println("6. View Payments");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    generateBill();
                    break;
                case 3:
                    recordPayment();
                    break;
                case 4:
                    viewFile("customers.txt");
                    break;
                case 5:
                    viewFile("bills.txt");
                    break;
                case 6:
                    viewFile("payments.txt");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}