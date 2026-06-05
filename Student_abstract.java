abstract class Student4
{
    abstract void name();
    abstract void rollNo();
}
class Studentdata extends Student4
{
    void name()
    {
        System.out.println("Name:Tahir");
    }
    void rollNo()
    {
        System.out.println("Roll No:12");
    }
}
public class Student_abstract {
    public static void main(String[] args)
    {
        StudentData s = new StudentData();
        s.name();
        s.rollNo();
    }
}