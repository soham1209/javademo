class Calc {
    public int add(int n1,int n2)
    {
        int result = n1 +n2;
        return result;
    }
    public int add(int n1, int n2, int n3){
        int result = n1+n2+n3;
        return result ;
    }
    public double add (double n1,double n2){
        double result = n1+n2;
        return result;
    }
}
public class MethodOverloding {

    public static void main(String[] args) {
        Calc obj = new Calc();//object created
        int result = obj.add(4,6);
        System.out.println(result);

        int result1= obj.add(7,8,9);
        System.out.println(result1);

        double result2= obj.add(4.3,8.9);
        System.out.println(result2);
    }
}
