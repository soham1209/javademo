//4
//Static vs Instance Variable
class Alpha{
    static public int a;
    static public int b;
    
    int m;
    int n;

    static {
        System.out.println("Static block");
        a= 10;
        b= 20;
    }
    {
        System.out.println("Non Static block");
        m = 100;
        n= 200;
    }
}
public class StatikKeyword3 {
    public static void main(String[] args) {
        Alpha a1= new Alpha();// as the objet created the instance variable memry acolcated
        Alpha a2= new Alpha();// but the valeu alocated two time

        // staic block is exicuted withou creation of object and it will exsicute befor mean mehtod
        // Alpha.a;//can incoved wihout refrance 
        // Alpha.b;//but it is defaltly private so make them public for theis exicution
        // System.out.println(Alpha.a);//use this for inoved
        
        // a1.m;//need of referece for invoced
        // a1.n;//but it is defaltly private so make them public for theis exicution
        // System.out.println(a1.m);//use this fo invoed
        
    }
}
