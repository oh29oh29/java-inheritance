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

자식 클래스 객체가 생성될 때 부모 클래스는 별도로 객체가 생성되지 않는다.

```java
public class Fruit {

    public Fruit() {
        System.out.println("Super class constructor");
        System.out.println("Super class object hashcode: " + this.hashCode());
        System.out.println("This class name: " + this.getClass().getName());
    }
}

public class Pineapple extends Fruit {

    public Pineapple() {
        System.out.println("Sub class constructor");
        System.out.println("Sub class object hashcode :" + this.hashCode());
        System.out.println("This class name: " + this.getClass().getName());
    }
}

public class Main {

    public static void main(String[] args) {
        Pineapple pineapple = new Pineapple();
    }
}
```

![부모 클래스를 상속받은 자식 클래스](images/IMG_inheritance_02.png)

위 코드를 보면, 생성자 호출이 클래스의 객체가 생성되었음을 의미하는 일반적인 가정과 다르다.  
따라서, 클래스 생성자가 실행될 때마다 해당 클래스의 객체가 생성되는지 여부를 맹목적으로 말할 순 없다.  

부모 클래스 객체의 해쉬코드와 자식 클래스 객체의 해쉬코드가 동일하다는 것에서 알 수 있듯이 하나의 객체만 생성되었다는 것을 알 수 있다.  
클래스의 이름도 자식 클래스인 Apple 만을 출력하고 있다.

## 다양한 상속 유형

#### Single Inheritance

```java
class Paper {}
class Document extends Paper {}
```

#### Multilevel Inheritance

```java
class Paper {}
class Document extends Paper {}
class Book extends Document {}
```

#### Hierarchical Inheritance

```java
class Paper {}
class Newspaper extends Paper {}
class Book extends Paper {}
class Box extends Paper {}
```

#### Multiple Inheritance

```java
interface Paper {}
interface Text {}
class Book implements Paper, Text {}
```

## Important facts about inheritance in Java

#### Default superclass

부모 클래스가 없는 Object 클래스를 제외하고, 모든 클래스는 오직 하나의 부모 클래스가 존재한다.  
명시적인 부모 클래스가 없는 경우 모든 클래스는 암시적으로 Object 클래스의 자식 클래스이다.  

#### Superclass can only be one

부모 클래스는 여러 자식 클래스를 가질 수 있지만 자식 클래스는 오직 하나의 부모 클래스만 가질 수 있다.  
자바에서는 클래스를 통한 다중 상속을 지원하지 않기 때문이다.  
다만, 인터페이스를 통한 다중 상속은 지원한다.

#### Inheriting Constructors

자식 클래스는 부모 클래스의 멤버(모든 필드, 메서드, 중첩 클래스)를 상속받는다.  
그러나 생성자는 멤버가 아니기 때문에 상속되지 않는다.  
부모 클래스의 생성자는 자식 클래스에 의해 실행된다.

#### Private member inheritance

자식 클래스는 부모 클래스의 private 멤버를 상속받지 않는다.  
그러나 부모 클래스에서 private 필드에 접근하기 위한 public 또는 protected 메서드(ex. getter(), setter())가 있는 경우 자식 클래스에서도 사용할 수 있다.  

## IS-A relationship

```java
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
```

![IS-A](images/IMG_inheritance_03.png)

#### 자식 클래스에서 할 수 있는 것은 무엇일까?

자식 클래스에서 부모 클래스의 멤버를 그대로 상속하거나 수정하거나 숨기거나 새 멤버로 보완할 수 있다.  
- 상속된 필드는 다른 필드와 마찬가지로 직접 사용할 수 있다.  
- 부모 클래스에 없는 새 필드를 선언할 수 있다.
- 상속된 메서드는 그대로 직접 사용할 수 있다.  
- 부모 클래스에 정의된 메서드를 재정의하여 사용할 수 있다.
- 부모 클래스에 정의된 메서드 시그니처와 동일한 메서드를 자식 클래스에서 새로운 static 메서드로 만들어서 숨길 수 있다.  
이건 확인이 직접 필요하다. 정확히 무슨 의미인지 이해하지 못한 내용이다.
- 부모 클래스에 없는 새 메서드를 선언할 수 있다.
- 묵시적 또는 명시적으로 super 키워드를 사용하여 부모 클래스의 생성자를 호출하는 자식 클래스 생성자를 작성할 수 있다.

<hr>

#### References

> 웹 문서
> - [geeksforgeeks | Inheritance in Java](https://www.geeksforgeeks.org/inheritance-in-java/)
> - [geeksforgeeks | Java Object Creation of Inherited Class](https://www.geeksforgeeks.org/gfact-52-java-object-creation-of-inherited-classes/)
