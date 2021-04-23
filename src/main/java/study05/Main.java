package study05;

/**
 * 해당 클래스는 The super Keyword With Method Overriding 에 대해서 확인하기 위해 작성되었다.
 * */
public class Main {
    public static void main(String[] args) {
        new ChildStudy().printMessage();
    }
}

class ParentStudy {
    String message = "Super class";

    public void printMessage() {
        System.out.println(message);
    }
}

class ChildStudy extends ParentStudy {
    String message = "Child class";

    public ChildStudy() {
        super.printMessage();
    }

    @Override
    public void printMessage() {
        System.out.println(message);
    }
}


