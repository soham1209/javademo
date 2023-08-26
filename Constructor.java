//1
//constructor in java
//used for initialise at the time of object creation
class Student {
    private int age;
    private String name;
     public Student(int age, String name) {//no compultion to declare public or private
        this.age = age;
        this.name = name;
    }
    
    
    // public void setAge(int age) { //no need of setter
    //     this.age = age;
    // }
    public int getAge() {
        return age;
    }
//    public void setName(String name) {
//         this.name = name;
//     }
     public String getName() {
        return name;
    }
    /*shortcut for constructor
     * right click
     * cources action
     * gentatie constructor
     * select variable 
     */
   
}

public class Constructor {
    public static void main(String[] args) {
        Student obj = new Student(30,"mogali");//value assinged to the time of initalisetion
        Student obj1 = new Student(15,"soham");
        // obj.setAge(45);//initalise at same time to object creation
        // obj.setName("bagira");

        // obj1.setAge(18);
        // obj1.setName("Mogali");

        int sud1Age = obj.getAge();
        String sud1Name = obj.getName();
        int sud2Age = obj1.getAge();
        String sud2Name = obj1.getName();
        System.out.println(sud1Age + " " + sud1Name);
        System.out.println(sud2Age+ " " +sud2Name);

    }
}
