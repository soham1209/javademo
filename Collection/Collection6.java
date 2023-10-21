import java.util.*;


public class Collection6 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(1);
        al1.add(10);
        al1.add(100);
        al1.add(1000);
        System.out.println(al1);

        // for loop
        // for (int i = 0; i < al1.size(); i++) {
        //     Object o = al1.get(i);
        //     System.out.println(o);
        // }

        // for each loop
        // for (Object o : al1) {
        //     System.out.println(o);
        // }
        Iterator itr= al1.iterator();
        while(itr.hasNext())
        {
           // Integer i=(Integer)itr.next();
           System.out.println(itr.next());
        }
        ListIterator litr= al1.listIterator(al1.size());
        while(litr.hasPrevious()){//it will print output in reverse manner
            System.out.println(litr.previous());
        }
    }
}
