//6
//constrcot execution in case inheritance
/*
class Demo1{
    int a,b;
    public Demo1(){//this call becouse of super method
        System.out.println("parrent class constructor");
    }
    public Demo1(int x ,int y){
        System.out.println("parameterized parent .. class constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1{
    int m,n;
    public Demo2(){
        // super();//atomtaicly call//defalt supre method call atomaticly colled and pass the  constrol to parent call zero parameterised construcor
        System.out.println("Child class constructor");
    }
    public Demo2(int x ,int y){
        //super();super method called and zero parametrised constor of parent class call
        System.out.println("parameterized child .. class constructor");
        m=x;
        n=y;
    }
}
public class Inheritance5 {
    public static void main(String[] args) {
        Demo2 d= new Demo2();//this call the demo2 zero paremeterised constructor//
        //thats why two constor call see in out put
        
    }
}
 */

//parent class constructor
// parameterized child call constructor
/*
class Demo1{
    int a,b;
    public Demo1(){
     //this will call on prametersed constor call
        System.out.println("parrent class constructor");
    }
    public Demo1(int x ,int y){
        System.out.println("parameterized parent .. class constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1{
    int m,n;
    public Demo2(){
        System.out.println("Child class constructor");
    }
    public Demo2(int x ,int y){
        //super();super method called and zero parametrised constor of parent class call//super method call zero parameter constro
        System.out.println("parameterized child .. class constructor");
        m=x;
        n=y;
    }
}
public class Inheritance5 {
    public static void main(String[] args) {
        Demo2 p= new Demo2(3, 7);//parametersied constructor call

    }
}
*/
//parameterized parent class constructor
//child class constructor
/*
class Demo1{
    int a,b;
    public Demo1(){
        System.out.println("parrent class constructor");
    }
    public Demo1(int x ,int y){// this constro call 
        System.out.println("parameterized parent .. class constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1{
    int m,n;
    public Demo2(){
        super(10, 4);//call to parent class parametersied constructor//if you want demo1 parametrised constor//you need to call super with parameters this will not call atomaticly
        System.out.println("Child class constructor");
    }
    public Demo2(int x ,int y){
        System.out.println("parameterized child .. class constructor");
        m=x;
        n=y;
    }
}
public class Inheritance5 {
    public static void main(String[] args) {
        // if you wnat parameterised constructor of demo1
        Demo2 d= new Demo2();
    }
}
*/
//parent class constructor
//parameterized child class constructor
// child class constructor
class Demo1{
    int a,b;
    public Demo1(){
        System.out.println("parrent class constructor");
    }
    public Demo1(int x ,int y){
        System.out.println("parameterized parent .. class constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1{
    int m,n;
    public Demo2(){
        this(10, 4);//this call same class constror//this will call demo 2 parametersed constor
        System.out.println("Child class constructor");
    }
    public Demo2(int x ,int y){
        super();//super method called and zero parametrised constor of parent class call
        System.out.println("parameterized child .. class constructor");
        m=x;
        n=y;
    }
}
public class Inheritance5 {
    public static void main(String[] args) {
        // if you wnat twice constro of demo 2 class
        Demo2 m= new Demo2();
    }
}