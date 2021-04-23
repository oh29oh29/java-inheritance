package study07;

public class Main {
    public static void main(String[] args) {
        House house = new Apartment();
        System.out.println(house.size);
        house.printSize();
    }
}

class House {
    int size = 10;

    void printSize() {
        System.out.println("House's size is:  " + size);
    }
}

class Apartment extends House {
    int size = 20;

    @Override
    void printSize() {
        System.out.println("Apartment's size is: " + size);
    }
}
