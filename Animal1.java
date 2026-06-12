public class Animal1
{
    void sound() {
        System.out.println("Animal makes a sound");
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}
class Dog extends Animal1 {

    void bark() {
        System.out.println("Dog barks");
    }
}