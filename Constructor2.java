//3
//constroctor ovreloding
class Student1{
    private String name;
    private int age;

    public Student1(){//this will be defalt constructor
        System.out.println("defalt constructor called");
        name ="soham";
        age=18;
    }
    public Student1(String name){
        System.out.println("singel argument constructor");
        this.name = name;
        age=19;
    }
    public Student1(String name,int age){
        System.out.println("double argument costructor");
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class Constructor2 {
    public static void main(String[] args) {
        Student1 obj1 = new Student1();
        System.out.println("name:"+ obj1.getName()+" "+" Age" +" "+ obj1.getAge());
        Student1 obj2= new Student1("soham");
        System.out.println("name:"+ obj2.getName()+" "+" Age" +" "+ obj2.getAge());
        Student1 obj3 = new Student1("soham", 18);
        System.out.println("name:"+ obj3.getName()+" "+" Age" +" "+ obj3.getAge());
        

    }
}
