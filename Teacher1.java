interface Teacher
{
    void teacherName();
    void courseName();
}
class TeacherData implements Teacher
{
    public void teacherName()
    {
        System.out.println("Teacher Name:Mubashar");
    }
    public void courseName()
    {
        System.out.println("Course:OOP");
    }
}
public class Teacher1
{
    public static void main(String[] args) {
        Teacher t = new TeacherData();
        t.teacherName();
        t.courseName();
    }
}