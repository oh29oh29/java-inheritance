package study02;

public class Pineapple extends Fruit {

    public Pineapple() {
        System.out.println("Sub class constructor");
        System.out.println("Sub class object hashcode :" + this.hashCode());
        System.out.println("This class name: " + this.getClass().getName());
    }
}
