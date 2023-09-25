//1
//introduction to polymorphism
class AroPlane{

    public void takeOff(){
        System.out.println( "aroplaen is taking off");
    }
    public void fly(){
        System.out.println( "aroplaen is flying");
    }
}
class CargoPlane extends AroPlane{
    public void takeOff(){
        System.out.println("cargo plane need big runway");//mehdod override
    }
    public void fly(){
        System.out.println("cargo plane fly at lower hight");
    }
}

class PassangerPlane extends AroPlane{
    public void takeOff(){
        System.out.println( "passanger palen need midsize runway");
    }
    public void fly(){
        System.out.println( "passanger plaen fly at higher hight");
    }
        }
public class Polymorphism {
    public static void main(String[] args) {
        
        CargoPlane cp= new CargoPlane();//cp object and its type is cargoplaen

        PassangerPlane pp= new PassangerPlane();//pp object and its type is passangerplane

        AroPlane ref;//ref object and its type is aroplane
        //aroplane is parent of cargo and passanger plane
        //and parent calss object  have capability to hold child class object address
        ref = cp;
        ref.takeOff();
        ref.fly();
        System.out.println("--------------------------------------------------------------------------------");
        ref= pp;
        ref.takeOff();//this two line are same but still give diffrent output so this is polymorphism   
        ref.fly();// this is only simple example not actual polymorphism
        // cp= pp;//this is not possible due not same variable name which are cargoplane and passangerplane in the line of object creation

    }
}


