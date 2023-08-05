public class classs {
    int a;
    String name;

    public static void main(String[] args) {
        // declaring variable
        // creating object
        int num = 10;// this is variable declaring it is known asprimitive
        a obj = new a();// this is object with new keyword
                        // obj is refrance variable and new a() is object
        a obj1 = new a();

        obj.name = "soham";
        System.out.println(obj.a);
        System.out.println(obj.name);

        System.out.println(obj1.a);
        System.out.println(obj1.name);

    }
}