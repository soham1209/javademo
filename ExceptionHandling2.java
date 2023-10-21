//3
//finaly block

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int val = 0;
        Scanner sc = new Scanner(System.in); // resorse created
                                             // heare we use scanner class so we use resorese of scanner class
                                             // if we create then we need to colse it also
        val = sc.nextInt();             // resorse used
        try {
            System.out.println(val);
            //if resorese closed here then when exceptin it not close
        } catch (InputMismatchException e) {
            System.out.println("Enter a number");
            //if resoerse colsed here then when exeption is not ther not colse
        }finally{//this excutes always
            sc.close();                     // resorse closed
        }
    }
    // public static void main(String[] args) {
    //     int num  = 0;
    //     //try with resorse
    //     //in this no need to colse the reosrese it atomaticly close after try block
    //     try(Scanner sc = new Scanner(System.in)){
    //         num = sc.nextInt();

    //     }
    //     System.out.println(num);
    // }
}
