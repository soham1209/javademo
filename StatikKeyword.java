//1
//understanding static
public class StatikKeyword{
    static int a;
    static {//before the mean method static block will be exucuted
        System.out.println("Static block");
        a = 10;
        System.out.println(10);
    }
    public static void main(String[] args) {
    System.out.println("Mean mehtod");
}
}
