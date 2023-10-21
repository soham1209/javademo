import java.util.*;

class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String ab = sc.nextLine();
        StringBuffer skr = new StringBuffer(ab);
       // System.out.println(skr.reverse());
       String rev = skr.reverse().toString();
       if(ab.equals(rev)){
           System.out.println("String is palindrome.");
           }
       else{
           System.out.println("String is not Palindrome");
           }
    }
}