//2
//more on constructor
//defalt constructor
class Demo {
    private int a;
    private int b;

    void getAB() {
        System.out.println(a);
        System.out.println(b);
    }

    public void disp1() {
    }

    public void disp2() {
    }

}

public class Constructor1 {
    public static void main(String[] args) {
        Demo d = new Demo();// it is a constructor call but erroer is not comeing
        //defalt constructor is ther with no parameter
        d.getAB();
        //but if you inculded you own constro or values to constror then the defalt constructor will not called

        
        
    }
}