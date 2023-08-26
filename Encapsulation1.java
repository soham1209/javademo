
//2
//taking value from the men method to student class metiod
class Student {
    private int age;
    private String name;

    public void setData1(int a) {// value assinged through men method
        age = a;//value of local vaiable assind to instance variable
    }

    public void setData2(String b) {
        name = b;
    }

    public void getData() {
        System.out.println(age + " " + name);
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();// if second object is created then
        obj.setData1(45);
        obj.setData2("namate");
        obj.getData();

        obj1.setData1(18);// the method need to call again
        obj1.setData2("Mogali");
        obj1.getData();

    }
}
