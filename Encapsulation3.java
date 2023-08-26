//4 
// setters and getters
// setters,and getter are used for incresing redibility
//setters are like setNmae first is what you are doing and then with witch vairable 

class Student {
    private int age;
    private String name;
    
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
   public void setName(String name) {
        this.name = name;
    }
     public String getName() {
        return name;
    }
 
    // setter and getter are standerds not the not rule `
    // how may variable are ther you need to type that mutch setter and getter 10 variable 10 setter and getter
    /*
     * right click
     * source aciton
     * gentate setters and getters 
     * chose variable for whom you wnat setter and getters
     */
}

public class Encapsulation3 {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setAge(45);// instance of setData setAge is used which is setter
        obj.setName("bagira");// and setData2 is setNmae it is setter

        obj1.setAge(18);
        obj1.setName("Mogali");

        // for getters
        int sud1Age = obj.getAge();//call the getter and set thet value to variable
        String sud1Name = obj.getName();
        int sud2Age = obj1.getAge();
        String sud2Name = obj1.getName();
        System.out.println(sud1Age + " " + sud1Name); //printing that variable
        System.out.println(sud2Age+ " " +sud2Name);

    }
}
