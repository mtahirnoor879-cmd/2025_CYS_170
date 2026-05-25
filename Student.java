public class Student {
    int rollNo;
    String name;
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    Student(int rollNo, String name) {
        this.rollNo=rollNo;
        this.name=name;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);}
    public static void main(String[] args) {
        Student s = new Student(1, "Ali");
        s.display();
        System.out.println();
    }
}
