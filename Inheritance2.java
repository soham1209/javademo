/*class Animal{
void sleep(){
    System.out.println("Animal need sleep");
}
}
class Tiger extends Animal
{

} 
public class Inheritance2 {
    public static void main(String[] args) {
        Tiger Tr = new Tiger();
        Tr.sleep();
    }
}//single level inheritance
*/
/*class Demo1{
    void display(){
        System.out.println("disp written in demo1");
    }
}
class Demo2 extends Demo1{

}
class Demo3 extends Demo2{

}
public class Inheritance2 {
    public static void main(String[] args) {
        Demo3 d= new Demo3();
        d.display();       
    }
}//multilevel inheritance
*/
class Animal {
    void sleep() {
        System.out.println("Animal need sleep");
    }
}

class Tiger extends Animal {

}
class Monkey extends Animal{

}
class Dear extends Animal{

}
public class Inheritance2 {
    public static void main(String[] args) {
        Tiger tr = new Tiger();
        tr.sleep();
        Monkey mo = new Monkey();
        mo.sleep();
        Dear de = new Dear();
        de.sleep(); 
    }
}
//when any class in java is not extends to any other class
//it bydefaultly extendts to object class
// ex - class soham //extends Object