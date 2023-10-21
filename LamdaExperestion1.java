//2
//Annoymous Inner class
//if you are making a sparate class for only implimenting a intrface(why to make sapret class for only implimenting the Interface) 
//then insted of it you can use Annoymous Inner class
interface Car {
    void drive();
}

// class WagonR implements Car{
// public void drive(){
// System.out.println( "driver drive car");
// }
// }
public class LamdaExperestion1
{
    public static void main(String[] args) 
    {
        Car obj = new Car()//heare no object of interface is created 
                            // but object of class is created 
                            // and the class is annoumous (wohout name)
                            //only one method is called at a time multiple time use saprate calss like WagonR
        {
            public void drive() 
            {
                System.out.println("driver drive car");
            }
        };
        obj.drive();
    }
}
