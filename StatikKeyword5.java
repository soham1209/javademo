//6
//static block and instailization block
public class StatikKeyword5 {
    static int age;
    static {//static block and static variable are give memory first and then mean method
        System.out.println("static bolck");
        age = 10;
    }

    static void disp() {
        System.out.println("disp funtion");
        System.out.println("the age is " + age);
    }

    public static void main(String[] args) {
        System.out.println("this is mean");

        //in this example all method are need to called only satic method and varaiable are direct execute at the time of loding
        // mean method is called by jvm it self
        //istailazation block create adn inselize memory when the objet is created
    }
}
