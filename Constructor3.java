//4
//this() va super() mehtod call
class Student1{
    private String name;
    private int age;

    public Student1(){
        this("obba",30);
        name ="soham";
        age=18;
    }
    public Student1(String name){
        this();//this mehtod is calling the same class constor with agrgumets given to this method
        this.name = name;
        age=20;
    }
    public Student1(String name,int age){
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
public class Constructor3 {
    public static void main(String[] args) {
        Student1 std1= new Student1();//1//after the process//call to first constructor
        System.out.println(std1.getName()+ " " + std1.getAge());//1//value given in the first constructor this are reflated

        Student1 std2 = new Student1("jay");//2// after all the process //call to second constructor
        System.out.println(std2.getName()+" "+std2.getAge());

    }
}
