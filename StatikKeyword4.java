//5
//static and instance method

import java.util.Arrays;

class Demo {
    static void disp1(){
        System.out.println("static method disp1");
    }
    void disp2(){
        System.out.println("non static method disp2");
    }
}
public class StatikKeyword4 {
    public static void main(String[] args) {
        Demo.disp1();//you can call static without object creation
        //Demo.disp2 // this will give error
        Demo d=new Demo();
        d.disp2();//non staic need to call with object
        d.disp1();//static can call with object also 

        Arrays.sort(args);  //array is inbuild mehtod in java 
                            //and we are calling it without object
                            //so we can say that sort is static method
    }
}
