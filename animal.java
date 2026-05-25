abstract class animal {
    abstract void sound(); {
        System.out.println("animal is eating");
    }
}
    class dog extends animal{
        void sound(){
            System.out.println("dog is barking now");
        }
    }
    class main{
    static void main(String[] args) {
        dog a = new dog();
        a.sound();
    }
}
