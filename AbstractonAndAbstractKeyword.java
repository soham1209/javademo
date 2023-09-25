//
//Abstraction & Abstract keyword
abstract class AroPlane {
    abstract public void takeOff();
    // abstract int a;//abstract variablle not possibl
    abstract public void fly();

}

class CargoPlane extends AroPlane {
    public void takeOff() {
        System.out.println("CargoPlane is fulying");
    }

    public void fly() {
        System.out.println("CargoPlane is flying");
    }
    public void Aleart(){
        System.out.println( "Aleart...");
    }
}

class PassangerPlane extends AroPlane {
    public void takeOff() {
        System.out.println("PassangerPlane is fulying");
    }

    public void fly() {
        System.out.println("PassangerPlane is flying");
    }
}

public class AbstractonAndAbstractKeyword {
    public static void main(String[] args) {
        AroPlane ref = new CargoPlane();
        ref.takeOff();
        ref.fly();
        // ref.Aleart();//specialied method can not call with parent class refrance 
        // for calling it 
        ((CargoPlane) ref).Aleart();//hear you are changing the refrance variable temprary to cargoplane//it is known as dout casting

        AroPlane ref1 = new PassangerPlane();
        ref1.takeOff();
        ref1.fly();
        
        // AroPlane ap= new AroPlane();//not possible
    }
}
