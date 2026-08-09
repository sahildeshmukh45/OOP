package Abstraction;

public class Main {
    public static void main(String[] args) {

        Parent a = new son();
        a.career();
        a.partner();

        Parent d = new daughter();
        d.career();

        // We cannot create an object of an abstract class directly.
        // It will give a compile-time error because an abstract class
        // may contain abstract methods that do not have a body.
        // Parent mom = new Parent();

        // An abstract class CAN have constructors.
        // We cannot create an object of the abstract class directly,
        // but its constructor is called when an object of its subclass is created.

        // An abstract class can have abstract methods, which do not have a body.
        // It can also have normal (concrete) methods that have a body.

        // An abstract static method is not allowed.
        // Static methods cannot be overridden; they are hidden.
        // Therefore, a method cannot be both abstract and static.
        // public abstract static void test(); // ERROR

        // We CAN create static methods inside an abstract class.
        // They are called using the class name.
        Parent.hello();

        // We can also create normal (concrete) methods in an abstract class.

        // An abstract class CAN have the final keyword.
        // A final abstract class is not allowed because a final class
        // cannot be extended, while an abstract class is meant to be extended.
        // public abstract final class Parent // ERROR

        System.out.println(a.num);
    }
}
