# Java Inheritance

상속은 객체지향 프로그래밍에서 가장 중요한 원칙 중 하나이다.  
자바는 하나의 클래스가 다른 클래스의 기능(필드 또는 메서드)을 상속하도록 허용한다.  

#### Super Class

기능이 상속된 클래스를 수퍼 클래스 또는 부모 클래스 라고 한다.  

#### Sub Class

다른 클래스를 상속받는 클래스를 하위 클래스 또는 자식 클래스 라고 한다.  
하위 클래스는 수퍼 클래스의 기능 외에도 자체 필드 및 페서드를 추가할 수 있다.  

#### Reusability

상속은 '재사용' 개념을 지원한다.  
즉, 새 클래스를 만들고 싶고 원하는 코드 중 일부를 포함하는 다른 클래스가 이미 있는 경우 기존 클래스에서 새 클래스를 파생할 수 있다.  
이를 통해 기존 클래스의 필드와 메서드를 재사용할 수 있다.

```java
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

public class Main {

    public static void main(String[] args) {
        MountainBike bike = new MountainBike(10, 100, 50);
        System.out.println(bike);
    }
}
```

![상속을 통한 필드 재활용](images/IMG_inheritance_01.png)

MountainBike 클래스의 객체가 생성되면 부모 클래스인 Bicycle 클래스의 모든 메서드와 필드의 복사본 역시 메모리에 할당된다.
MountainBike 객체는 이 메모리를 참조하여 부모 클래스의 멤버에도 접근할 수 있다.

<hr>

#### References

> 웹 문서
> - [geeksforgeeks | Inheritance in Java](https://www.geeksforgeeks.org/inheritance-in-java/)
> - [geeksforgeeks | Java Object Creation of Inherited Class](https://www.geeksforgeeks.org/gfact-52-java-object-creation-of-inherited-classes/)
