//1
//inner class
//member and static
class A {
    public void show(){
        System.out.println( "showing output");
    }
    // class B {//only inner class can be static
    //     public void display(){
    //         System.out.println( "displaying obj");
    //     }
    // }
    static class B {
        public void display(){
            System.out.println( "displaying obj");
        }
    }
}

public class LamdaExprestion {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        //for object of b 
        // A.B obj1= obj.new B();
        A.B obj1= new A.B(); //if static
        obj1.display();
    }
}
