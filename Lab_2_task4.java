public class Lab_2_task4
{
    public static void main(String[] args)
    {
        boolean hasID=true;
        boolean isOver18=true;
        if (hasID&&isOver18)
        {
            System.out.println("Acess granted");
        }
        if(hasID||isOver18)
        {
            System.out.println("Special guest");
        }
    }
}