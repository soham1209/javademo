//2
//interface implimentation
interface A{
    void show();
}
interface B{
    void goli();
}
class C implements A,B{
    public void show(){
        System.out.println("implements show");
    }
    public void goli(){
    
    }
}
public class Interface1 {
    public static void main(String[] args) {
        // B obj = new B();
        A obj = new C();//allowed with defination of only a 
        obj.show();

        C obj1 = new C();
        // B obj1 = new C();//allowed with defination of only b
        // A obj1 = new C();//not allowed
        obj1.goli();

        
    }
}
