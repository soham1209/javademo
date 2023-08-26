public class CommandLineCalculator {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2= Integer.parseInt(args[2]);
        // switch (args[1]) {
        //     case "+":
        //         System.out.println(num1+num2);
        //         break;
        //     case "-":
        //         System.out.println(num1-num2);
        //         break;
        //     case "*":
        //         System.out.println(num1*num2);
        //         break;
        //     case "/":
        //         System.out.println(num1/num2);
        //         break;                
        //     default:
        //         System.out.println("you are chutya");
        //         break;
            System.out.println(num1 + num2);
        }
    }
}
