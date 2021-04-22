package study08;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Human> humans = List.of(new Man(), new Woman());
        final List<House> houses = List.of(new Apartment(), new Villa());
        humans.forEach(human -> houses.forEach(human::print));
    }
}

interface House {
    void printWhoLivesIn(Man man);
    void printWhoLivesIn(Woman woman);
}
class Apartment implements House {
    @Override
    public void printWhoLivesIn(Man man) {
        System.out.println("A man lives in this Apartment.");
    }

    @Override
    public void printWhoLivesIn(Woman woman) {
        System.out.println("A woman lives in this Apartment.");
    }
}
class Villa implements House {
    @Override
    public void printWhoLivesIn(Man man) {
        System.out.println("A man lives in this Villa.");
    }

    @Override
    public void printWhoLivesIn(Woman woman) {
        System.out.println("A woman lives in this Villa.");
    }
}

interface Human {
    void print(House house);
}
class Man implements Human {
    @Override
    public void print(House house) {
        house.printWhoLivesIn(this);
    }
}
class Woman implements Human {
    @Override
    public void print(House house) {
        house.printWhoLivesIn(this);
    }
}
