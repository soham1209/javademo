//4
//type of method in inheritance
//inherited
/*
class AeroPlane{
    public void takeOff(){
        System.out.println("Aroplane is taking off");
    }
    public void fly(){
        System.out.println("Aroplane is flying");
    }
}
class CargoPlane extends AeroPlane{

}
class PassasengerPlane extends AeroPlane{

}

public class Inheritance3 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();

        PassasengerPlane pp = new PassasengerPlane();
        pp.takeOff();
        pp.fly();
    }    
}
*/
//overriden
/* 
class AeroPlane{
    public void takeOff(){
        System.out.println("Aroplane is taking off");
    }
    public void fly(){
        System.out.println("Aroplane is flying");
    }
}
class CargoPlane extends AeroPlane{
    public void fly(){
        System.out.println("Cargoplane on the expected hight");
    }
}
class PassasengerPlane extends AeroPlane{
    public void fly(){
        System.out.println("PassangerPlane on the expected hight");
    }

}

public class Inheritance3 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();

        PassasengerPlane pp = new PassasengerPlane();
        pp.takeOff();
        pp.fly();
    }    
}
*/
//specialized
class AeroPlane{
    public void takeOff(){
        System.out.println("Aroplane is taking off");
    }
    public void fly(){
        System.out.println("Aroplane is flying");
    }
}
class CargoPlane extends AeroPlane{
    public void fly(){
        System.out.println("Cargoplane on the expected hight");
    }
    public void carryGoods(){
        System.out.println("CargoPlane carry goods");
    }
}
class PassasengerPlane extends AeroPlane{
    public void fly(){
        System.out.println("PassangerPlane on the expected hight");
    }
    public void carryPassanger(){
        System.out.println("passangerPlane carry passanger");
    }
}

public class Inheritance3 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();

        PassasengerPlane pp = new PassasengerPlane();
        pp.takeOff();
        pp.fly();
    }    
}
