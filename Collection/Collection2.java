// ArrayDeque
import java.util.ArrayDeque;

public class Collection2 {
    public static void main(String []args){
        ArrayDeque ad1= new ArrayDeque();
        ad1.add(100);
        ad1.add(200);
        ad1.add(200);
        System.out.println(ad1);
        
        ad1.addFirst(10);
        ad1.addLast(20);
        System.out.println(ad1);
    
        ad1.add("pw");
        System.out.println(ad1);
        
        ad1.offer(1000);
        ad1.offerFirst(2000);
        ad1.offerLast(3000);//work same as add
        System.out.println(ad1);
    }
}
