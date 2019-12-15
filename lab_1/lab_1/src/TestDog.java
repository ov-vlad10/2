import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jack", 1, 18, "black");
        Dog d2 = new Dog("Polkan", 1);
        Dog d3 = new Dog("Tuzik");
        d3.setAge(4);
        d3.setColor("pink");

        System.out.println(d1);
        d1.intoHumanAge();

        System.out.println(d2);
        d2.intoHumanAge();

        System.out.println(d3);
        d3.intoHumanAge();
    }
}
