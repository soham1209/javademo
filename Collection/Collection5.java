//HashSet and LinkedHashSet

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Collection5 {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet();
        hs1.add(100);
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);
        System.out.println(hs1);//sotred using hashing

        LinkedHashSet lhs1 = new LinkedHashSet();
        lhs1.add(100);
        lhs1.add(40);
        lhs1.add(30);
        lhs1.add(20);
        System.out.println(lhs1);//reteurn as interd

    }
}
