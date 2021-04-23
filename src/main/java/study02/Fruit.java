package study02;

public class Fruit {

    public Fruit() {
        System.out.println("Super class constructor");
        System.out.println("Super class object hashcode: " + this.hashCode());
        System.out.println("This class name: " + this.getClass().getName());
    }
}
