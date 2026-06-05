interface Student2
{
    void name();
    void rollNo();
}
class StudentData implements Student2
{
    public void name()
    {
        System.out.println("Name:Tahir");
    }
    public void rollNo()
    {
        System.out.println("Roll NO:12");
    }
}
public class Student1 {
    public static void main(String[] args)
    {
        StudentData s = new StudentData();
        s.name();
        s.rollNo();
    }
}