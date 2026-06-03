public class Lab_2_task5
{
    public static void main(String[] args)
    {
        int random_number=(int)(Math.random()*11);
        int userguess=5;
        {
            if(random_number==userguess)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("false");
            }
        }
    }
}