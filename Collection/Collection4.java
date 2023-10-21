//TreeSet

import java.util.TreeSet;

public class Collection4 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);

        // ts.add(100);//no dulblicate allowed
        // System.out.println(ts);
        
        // ts.add("pw");//no mixed data allowd 
        // System.out.println(ts);
        
        System.out.println(ts.higher(50));//give next higher value to 5o
        System.out.println(ts.lower(50));//give next lower value to 5o
        
        System.out.println(ts.ceiling(40));//give next higher value to 4o
        System.out.println(ts.floor(40));//give next lower value to 40
    }
}
