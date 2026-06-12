public class Owner {
    String name;
    int age;
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        dog1 d = new dog1();
        d.showdog1();
    }
}
class dog1 {
    void showdog1()
    {
        System.out.println("dog");
        System.out.println(5);
        Owner o = new Owner();
        o.name = "Tahir";
        o.age = 19;
        o.display();
    }
}