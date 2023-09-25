//2
//more on polymorphism
class AroPlane{
    public void takeOff(){
        System.out.println("Aroplane is Taking off");
    }
    public void fly(){
        System.out.println( "Aroplane is flying");
    }
}
class CargoPlane extends AroPlane{
    public void takeOff(){
        System.out.println("CargoPlane is fulying");
    }
    public void fly(){
        System.out.println( "CargoPlane is flying");
    }
}
class PassangerPlane extends AroPlane{
    public void takeOff(){
        System.out.println("PassangerPlane is fulying");
    }
    public void fly(){
        System.out.println( "PassangerPlane is flying");
    }
}
class FiterPlane extends AroPlane{
    public void takeOff(){
        System.out.println("FiterPlane is fulying");
    }
    public void fly(){
        System.out.println( "FiterPlane is flying");
    }
}
class Poly{
    public void poly(AroPlane ref){
        ref.takeOff();
        ref.fly();
        System.out.println("--------------");
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {

        CargoPlane cp= new CargoPlane();
        
        PassangerPlane pp= new PassangerPlane();

        FiterPlane fp= new FiterPlane();
        
        Poly p= new Poly();
        p.poly(cp);
        p.poly(pp);
        p.poly(fp);
        // cp.takeOff();
        // cp.fly();

        // pp.takeOff();
        // pp.fly();

        // fp.takeOff();
        // fp.fly();
    }
}
