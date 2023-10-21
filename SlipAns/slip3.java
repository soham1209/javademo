import java.util.Scanner;

class Count {
    private int b;
    private double c;

    public void noOfDigit(int a) {//this count the no of digits
        int temp = a;
        while (temp > 0) {
            b++;
            temp = temp / 10;
        }
    }
    //short code is avable in porgramz
    //just take the b++ to the below code from the above function and done no need of above function 
    public void getAdd(int a) {//add the digiits 
        int temp1 = a;
        while (temp1 > 0) {
            c = c + Math.pow(temp1 % 10, b);
            temp1 = temp1 / 10;
        }
    }

    public void checkAramstrong(int a) {
        if (a == c)
            System.out.println("It is an Armstrong Number");

        else
            System.out.println("It is not an Armstrong Number");
    }
}

public class slip3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to check");
        int num = sc.nextInt();
        Count co = new Count();
        co.noOfDigit(num);
        co.getAdd(num);
        co.checkAramstrong(num);
    }
}
