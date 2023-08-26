//3
//solving shadowing problem & this key
class Student {
    private int age;
    private String name;

    public void setData1(int age) {
//        age = age;  //here compilor giving prefrance to local vaiable thts why problem come
                      //so it is shadowing problem
        this.age = age;//here the this keywoed is used for calling the instace variable of object wich called the method
    }

    public void setData2(String name) {
        this.name = name;
    }

    public void getData() {
        System.out.println(age + " " + name);
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Student obj = new Student();//"this" use this object
        Student obj1 = new Student();
        obj.setData1(45);//and this variable is calling the value of object's instance vairable
        obj.setData2("bagira");
        obj.getData();

        obj1.setData1(18);
        obj1.setData2("Mogali");
        obj1.getData();
        //simple for using instance variable use this keyword 
    }
}


