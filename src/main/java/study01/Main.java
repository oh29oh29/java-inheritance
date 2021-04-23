package study01;

/**
 * 해당 클래스는 부모 클래스를 상속받은 자식 클래스에서 부모 클래스의 필드와 메서드를 사용할 수 있는지 확인하기 위해 작성되었다.
 * */
public class Main {

    public static void main(String[] args) {
        MountainBike bike = new MountainBike(10, 100, 50);
        System.out.println(bike);
    }
}
