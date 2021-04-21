package study06;

/**
 * 해당 클래스는 Dynamic Method Dispatch 를 확인하기 위해서 작성되었다.
 */
public class Main {
    public static void main(String[] args) {
        House house = new House();
        Apartment apartment = new Apartment();
        Villa villa = new Villa();

        House reference;

        reference = house;
        reference.print();

        reference = apartment;
        reference.print();

        reference = villa;
        reference.print();
    }
}

class House {
    void print() {
        System.out.println("Hello House");
    }
}

class Apartment extends House {
    @Override
    void print() {
        System.out.println("Hello Apartment");
    }
}

class Villa extends House {
    @Override
    void print() {
        System.out.println("Hello Villa");
    }
}
