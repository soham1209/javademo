//1
//try and catch block
//it make code unstopable by excetion
public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int re = 0;
        try {// if exceptin throw //try to give logical statement in try block not a simple
             // statment
            re = a / b;
        } catch (Exception obj) {   // this will catch it and show message
                                    // obj can be any like e
            System.out.println("somthing went wrong"+ obj);
        }
        System.out.println(re);
        System.out.println("hi");
    }
}
