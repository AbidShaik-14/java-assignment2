interface Animal {
    void eat();
}
interface Bird {
    void fly();
}
class Bat implements Animal, Bird {
    public void eat() {
        System.out.println("Bat is Eating....");
    }
    public void fly() {
        System.out.println("Bat is Flying....");
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();
        bat.fly();
    }
}
