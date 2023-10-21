//2
//try catch
//mutliple catch block for one try 
public class ExceptionHandling1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int re = 0;
        int value[]={7,8,9,4};
        try {
            re = a / b;
             System.out.println(value[5]);
        } catch (ArithmeticException e) {//for handling Arithmetic Exception
            System.out.println("can not devide by zero"+ e);
        }
        catch (IndexOutOfBoundsException e) {//for handling IndexOutOfBoundsException
            System.out.println("stay in your limit"+ e);
        }//any exceptin can come for we can write as much ececptin you know and after that we writer exceptin obj
        catch(Exception e){
            System.out.println( "sothing went wrong..!"+e);
        }
        System.out.println(re);
        System.out.println("hi");
    
    }
}
