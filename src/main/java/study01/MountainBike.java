package study01;

/**
 * 해당 클래스는 자식 클래스에 해당하며 자식 클래스에 필드와 메서드가 상속되는 것을 확인하기 위해 작성되었다.
 * */
public class MountainBike extends Bicycle {

    private int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return super.toString() + ", seatHeight=" + seatHeight;
    }
}
