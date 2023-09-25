//2
//more on inhreitace

class Human {
    private String name;
    int age;

    Human(){
        System.out.println("this is human constructor");
    }
    void sleep() {
        age = 18;
        System.out.println("human need good slip");
        System.out.println(age);
    }
}

class Student extends Human{
    // Student(){
        // super()//this call the parent class constructor
    // }
    void dis(){
        System.out.println("my age is "+ age);
        // System.out.println("my name is "+ soham);this will not inheritace becouse private
    }
}

class Inheritance1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.dis();
        //conxtructor of parants class will not be inherted but still it is exicutes
        //yes
        /*becouse we are making a object of student class default constror of student call 
        get called 
        in that constructor suprer mehtod is alredy presend defltly will give call to parent class non prametersied constror
        */
    }
}