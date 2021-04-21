package study04;

/**
 * 해당 클래스는 Accessing Parent Class Variables 에 대해서 확인하기 위해 작성되었다.
 * */
public class Main {
    public static void main(String[] args) {
        new ChildStudy().printParentMessage();
    }
}

class ParentStudy {
    String message = "Super class";
}

class ChildStudy extends ParentStudy {
    String message = "Child class";

    public void printParentMessage() {
        System.out.println(super.message);
    }
}


