//priorityQueue
import java.util.PriorityQueue;

public class Collection3 {
    public static void main(String []args){
        PriorityQueue pq1 = new PriorityQueue();
        pq1.add(100);
        pq1.add(50);
        pq1.add(150);
        pq1.add(25);
        pq1.add(75);
        pq1.add(125);
        pq1.add(175);//it impliment the min - Heap in back end
        
        System.out.println(pq1);
        
        pq1.add(25);
        System.out.println(pq1);

        // pq1.add("pw");//not allowed run time error
    }
}
