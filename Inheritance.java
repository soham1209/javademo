// 1
//basic of inheritacne
class Human {//supre class//base class//parent class
    int age;

    void sleep() {
        age = 18;
        System.out.println("human need good slip");
        System.out.println(age);
    }
}

class Student extends Human{//child class//sub class//derived class
    //this is inhritance with extends word

}

class Inheritance {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();//this will give error before inheritace
                //after inheritance you can use the mehtods of human class
    }
}