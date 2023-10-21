//5 
//rethrowing exceptin (throw,throws,finally)&coustom exception
// public class ExceptionHandling4 {
//     public static void main(String[] args) {
//         int num1 = 10;
//         int num2 = -2;
//         try {
//             if (num2 < 0) {
//                 Exception e = new ArithmeticException("Enter Positive number");// exceptin calss object//this is custom exceptin we can decide it type and also give message
//                 throw e;//give same value of catch block
//             } else {
//                 int result = num1 / num2;
//                 System.out.println(result);
//             }
//         }

//         catch (Exception e) {
//             System.out.println("Enter valid input"+e);
//         }
//     }
// }

//for custom exception
class MyException extends Exception{//myexceion custom class is exteded through thats why it incude every method of Exception class
    public    MyException(){}//this is defalt counstructor
    public MyException(String msg)//this counstructor are for geting the message form the object in if statment
                                //now we want to pass this msg in parent class counstructor for that use a supre mehtod
    {
        super(msg);//it called parent class parametrised counstructor
    }
}
public class ExceptionHandling4 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = -2;
        try {
            if (num2 < 0) {
                Exception e = new MyException("Enter Postive Number");//here is coustrom Excetion
                throw e;
            } else {
                int result = num1 / num2;
                System.out.println(result);
            }
        }

        catch (Exception e) {
            System.out.println("Enter valid input"+e);
        }
    }
}