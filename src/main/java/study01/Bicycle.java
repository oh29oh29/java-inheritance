package study01;

/**
 * 해당 클래스는 부모 클래스에 해당하며 자식 클래스에 필드와 메서드가 상속되는 것을 확인하기 위해 작성되었다.
 * */
public class Bicycle {

    private int gear;
    private int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "gear=" + gear +
                ", speed=" + speed;
    }
}