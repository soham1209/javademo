//4
//java 8 features & functional interface
interface A {
    void show();

    default void config() {
        // now this can define
        System.out.println("config hihi");
    }

    static void config1() {
        // now this can define
        System.out.println("confing1 haha");
    }

}

class B implements A {
    public void show() {
        System.out.println("show mehtod");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        // satic method can call directly
        A.config1();
        // non static can not call derectly
        // A.show();
        A obj = new B();
        obj.show();
        obj.config();
        // we can override mehtod
    }
}
