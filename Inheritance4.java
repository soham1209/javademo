//5
// reules of overriding
class Animal{
    public void eat(){
        System.out.println("animal eats everday");
    }
    public void sleep(int a){
    }
}
class Tiger extends Animal{
    // private void eat(){}//this is not allowed
    public void eat(){
        System.out.println("animal eats nextday");
    }
    // public int eat(){ return 1}//this is not allowed
    public void sleep(){}// this will considered as new method
}
public class Inheritance4 {
    public static void main(String[] args) {
        
    }
}
