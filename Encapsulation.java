
//1
// this is encapsultaion of data with private members
class Student{
        private int age;
        private String name;

        public void setData(){
            age= 18;//private members only assend by inclass methods
            name= "soham";
        }
        public void getData(){
            System.out.println(age +" "+ name);
        }
    }
public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();//declareing new objct
        obj.setData();//mehtod call
        obj.getData();//method call
        
    }
}
