public class Lab_2_task8

{
    public static void main(String[] args)
    {
        String currency="EUR";
        switch (currency)
        {
            case "USD":
                System.out.println("United states dollar");
                break;
            case "GBP":
                System.out.println("British Pound");
                break;
            case "EUR":
                System.out.println("Euro");
                break;
            default:
                System.out.println("Unknown currency");
        }
    }
}