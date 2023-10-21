//4
//handling vs ducking  Exception

//handling error
// class Demo {
//     public void a() {
//         b();
//     }

//     public void b() {
//         int num1 = 5;
//         int num2 = 0;
//         int result = 0;
//         try {
//             result = num1 / num2;
//             System.out.println(result);
//         } catch (Exception e) {
//             System.out.println("error.." + e.getMessage());
//         }
//     }
// }

// public class ExceptionHandling3 {
//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         obj.b();
//     }
// }

// ducking error
class Demo {
    public void a() throws Exception//if even a dies not want to handel execption
     {//b class exception hadeled in a 
        // try {
            b();
            
        // } catch (Exception e) {
            // System.out.println( "error..."+e.getMessage());
        // }
    }//if you want to hadnel exeptin by a then erres throws exceptin and then uncoment all 

    public void b()throws Exception {//this is ducking excption
        // telling that exception can accure but b class is not going to handel it
        int num1 = 5;
        int num2 = 0;
        int result = 0;
        
            result = num1 / num2;
            System.out.println(result);
    }
}

public class ExceptionHandling3 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        try{
        obj.b();
            }
        catch(Exception e){
            System.out.println("error"+e.getMessage());
        }
    }
}
