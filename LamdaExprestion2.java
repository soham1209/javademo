//3
//lamda expreston
//work with only function interface (one method in interface)
//0 variable
/*
interface A{//if not function interface not work
    void show();
}
public class LamdaExprestion2 {
    public static void main(String[] args) {
        A obj = () -> System.out.println("show method");
                //   ->{ System.out.println("show funtio");}//if multiple line use {} this
        obj.show();
    }
}
 */
//one parameter
/*interface Car{
    void drive(int avg);
}
public class LamdaExprestion2 {
    public static void main(String[] args) {
        Car obj = avg -> System.out.println("show method" + avg);
        // or
        // Car obj =( avg )-> System.out.println("show method" + avg);

        obj.drive(19);
    }
}*/
//two parameter
interface Car{
    void drive(int avg ,int avg1);
}
public class LamdaExprestion2 {
    public static void main(String[] args) {
        Car obj = (avg,avg1) -> System.out.println("show method" + avg+avg1);

        obj.drive(19,65);
    }
}