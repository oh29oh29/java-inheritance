package study03;

/**
 * 해당 클래스는 IS-A relationship 에 대해서 확인하기 위해 작성되었다.
 * */
public class Main {

    public static void main(String[] args) {
        final House house = new House();
        final Apartment apartment = new Apartment();
        final Villa villa = new Villa();
        final Xi xi = new Xi();

        System.out.println("house instanceof House: " + (house instanceof House));
        System.out.println("apartment instanceof House: " + (apartment instanceof House));
        System.out.println("villa instanceof House: " + (villa instanceof House));
        System.out.println("xi instanceof House: " + (xi instanceof House));
    }

}


class House {}
class Apartment extends House {}
class Villa extends House {}
class Xi extends Apartment {}
