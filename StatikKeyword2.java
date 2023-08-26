//3
// simple intrest calculator
//use of static vairable

import java.util.Scanner;

class Farmer {
    int pa;
    float td;
    static float ri;
    float si;

    static {// static block
        ri = 4.5f;
    }

    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount required");
        pa = input.nextInt();
        System.out.println("Enter the time duration in year");
        td = input.nextFloat();

        // ri=4.5f;// if non static
    }

    void compute() {
        si = (pa * ri * td) / 100f;
    }

    void getSi() {
        System.out.println("Simple Intrest is :" + si);
    }
}

public class StatikKeyword2 {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();

        f1.input();
        f1.compute();
        f1.getSi();

        f2.input();
        f2.compute();
        f2.getSi();
        // here all value of pa td and si will be change as per every object
        // but the ri is constant
        // so for beter memry alocation is done by static variable
        // only one time memry alocated and then execute for all
    }
}
