public class secondjjava {
    public static void main(String[] args) {
        //implicate typecasting
        int data = 45;
        double fata;
        fata = data;
        System.out.println(fata);
        //explicate typecasting
        double num1 = 45.7;//it is forceful converstion
        int num2;
        // num2 = num1;//this will through error
        num2 = (int)num1;
        int n1 = 12,n2 = 5;
        float res = n1/n2;
        System.out.println(res);// here the value should be 2.2 but the answer come 2.0 this called trancation
    }
}