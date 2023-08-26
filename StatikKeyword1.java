//2
//Static and non static member of class
class Demo1{
    static int a;// static variable and block memory will be made without making of object
    static int b;// and static block and static method print in its order
    
    int m;// this are instance variable withch will get the memry after object creation
    int n;

    static{
        System.out.println("control in the Static block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("control in the non static block");
        m = 30;
        n=40;

    }

    static void getAB(){
        System.out.println("value of static variable a:"+a);
        System.out.println("value of static variable b:"+b);
    }

    void getMN(){
        System.out.println("value of non-static variable m:"+m);
        System.out.println("value of non-static variable n:"+n);
    }
}
public class StatikKeyword1 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();//object created

        Demo1.getAB();// it can be execute without using of object

        d.getMN();//need to use object

        
    }
}
